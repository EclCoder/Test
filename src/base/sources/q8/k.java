package q8;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface k {
    void a();

    void b(ViewGroup viewGroup, String str);

    void c(String str);

    void d(String str, String str2);

    void e(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener);

    void f(MBSplashShowListener mBSplashShowListener);

    void g(ViewGroup viewGroup);

    void onDestroy();

    void setExtraInfo(JSONObject jSONObject);
}
