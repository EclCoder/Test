package uh;

import android.app.Application;
import androidx.lifecycle.z0;
import com.hecorat.screenrecorder.free.R;
import gl.s0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r0 extends m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54580j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Application application, z0 state) {
        super(application, state);
        kotlin.jvm.internal.s.h(application, "application");
        kotlin.jvm.internal.s.h(state, "state");
        androidx.lifecycle.p0 p0VarC = state.c("selected_video_ids", s0.d());
        this.f54579i = p0VarC;
        this.f54580j = p0VarC;
    }

    public final androidx.lifecycle.k0 B() {
        return this.f54580j;
    }

    public final boolean C() {
        Boolean bool = (Boolean) v().b("is_single");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void D(boolean z10) {
        v().f("is_single", Boolean.valueOf(z10));
    }

    public final void E(String id2) {
        kotlin.jvm.internal.s.h(id2, "id");
        if (C()) {
            v().f("selected_video_ids", s0.c(id2));
            this.f54579i.q(s0.c(id2));
            return;
        }
        Set setD = (Set) this.f54579i.f();
        if (setD == null) {
            setD = s0.d();
        }
        Set setI = setD.contains(id2) ? s0.i(setD, id2) : s0.k(setD, id2);
        v().f("selected_video_ids", setI);
        this.f54579i.q(setI);
    }

    @Override // uh.m0
    protected rh.g p() {
        return new rh.h(j());
    }

    @Override // uh.m0
    protected String q() {
        String string = j().getString(R.string.all_videos);
        kotlin.jvm.internal.s.g(string, "getString(...)");
        return string;
    }
}
