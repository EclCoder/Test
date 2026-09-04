package l8;

import android.content.Context;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    public InterstitialAd a(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public InterstitialAd b(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public MediaView c(Context context) {
        return new MediaView(context);
    }

    public AdView d(Context context, String str, String str2) {
        return new AdView(context, str, str2);
    }

    public RewardedVideoAd e(Context context, String str) {
        return new RewardedVideoAd(context, str);
    }
}
