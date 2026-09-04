package q8;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    void a(Context context, String str, String str2);

    void b(NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void loadFromBid(String str);

    void playVideoMute(int i10);

    void setExtraInfo(JSONObject jSONObject);

    void showFromBid();
}
