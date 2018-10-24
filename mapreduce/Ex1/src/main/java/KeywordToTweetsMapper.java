import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;

import java.io.IOException;

public class KeywordToTweetsMapper extends Mapper<LongWritable, Text, Text, Text> {
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
      //Pre processing of tweet from arg value
        String stringTweet = value.toString();
        try {
            Status status = TwitterObjectFactory.createStatus(stringTweet);
            String tweet = status.getText().toUpperCase();

            //Look for word in tweet, add it to context for intermidiate output
            if (tweet.contains("FLU")){
                context.write(new Text("FLU"), new Text(String.valueOf(status.getId())));
            }
            if (tweet.contains("ZIKA")){
                context.write(new Text("ZIKA"), new Text(String.valueOf(status.getId())));
            }
            if (tweet.contains("DIARRHEA")){
                context.write(new Text("DIARRHEA"), new Text(String.valueOf(status.getId())));
            }
            if (tweet.contains("EBOLA")){
                context.write(new Text("EBOLA"), new Text(String.valueOf(status.getId())));
            }
            if (tweet.contains("SWAMP")){
                context.write(new Text("SWAMP"), new Text(String.valueOf(status.getId())));
            }
            if (tweet.contains("CHANGE")){
                context.write(new Text("CHANGE"), new Text(String.valueOf(status.getId())));
            }
        }
        catch(TwitterException e){
        }
    }
}
