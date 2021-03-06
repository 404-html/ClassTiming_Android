package in.championswimmer.classtiming;

import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import in.championswimmer.classtiming.tto.TimingTestOne;


public class MainActivity extends ActionBarActivity {
    public static final String TAG = "TimingTest";

    static {
        Log.d(TAG, "before anything static" + SystemClock.elapsedRealtimeNanos());

        TimingTestOne.gen100();
        Log.d(TAG, "after gen100 static" + SystemClock.elapsedRealtimeNanos());


        TimingTestOne tto01 = new TimingTestOne();
        Log.d(TAG, "after first  static" + SystemClock.elapsedRealtimeNanos());

        TimingTestOne tto02 = new TimingTestOne();
        Log.d(TAG, "after second  static" + SystemClock.elapsedRealtimeNanos());
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "before anything" + SystemClock.elapsedRealtimeNanos());

        TimingTestOne.gen100();
        Log.d(TAG, "after gen100" + SystemClock.elapsedRealtimeNanos());

        TimingTestOne tto1 = new TimingTestOne();
        Log.d(TAG, "after first" + SystemClock.elapsedRealtimeNanos());

        TimingTestOne tto2 = new TimingTestOne();
        Log.d(TAG, "after second" + SystemClock.elapsedRealtimeNanos());


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
