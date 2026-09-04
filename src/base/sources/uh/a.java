package uh;

import android.app.Application;
import androidx.lifecycle.z0;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application, z0 state) {
        super(application, state);
        kotlin.jvm.internal.s.h(application, "application");
        kotlin.jvm.internal.s.h(state, "state");
    }

    @Override // uh.m0
    protected rh.g p() {
        return new rh.f(j());
    }

    @Override // uh.m0
    protected String q() {
        String string = j().getString(R.string.all_audio);
        kotlin.jvm.internal.s.g(string, "getString(...)");
        return string;
    }
}
