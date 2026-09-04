package x3;

import android.app.Application;
import android.content.Context;
import com.pairip.StartupLauncher;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends Application {
    static {
        StartupLauncher.launch();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a.l(this);
    }
}
