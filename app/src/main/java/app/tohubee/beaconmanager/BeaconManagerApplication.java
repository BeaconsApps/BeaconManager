package app.tohubee.beaconmanager;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

/**
 * Created by USER on 25/05/2015.
 */
public class BeaconManagerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        String appId = "j127dra-gmail-com-s-your-o-nx7";
        String appToken = "e0e6a97e22a6012d451c974cec091088";

        //  App ID & App Token can be taken from App section of Estimote Cloud.
        EstimoteSDK.initialize(this, appId, appToken);
        // Optional, debug logging.
        EstimoteSDK.enableDebugLogging(true);
    }

}
