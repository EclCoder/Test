package jh;

import com.hecorat.screenrecorder.free.ui.live.youtube.LoginYtFragment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static void a(LoginYtFragment loginYtFragment, bg.a aVar) {
        loginYtFragment.getAuthStateUseCase = aVar;
    }

    public static void b(LoginYtFragment loginYtFragment, rf.d dVar) {
        loginYtFragment.liveYtRepository = dVar;
    }

    public static void c(LoginYtFragment loginYtFragment, lg.a aVar) {
        loginYtFragment.preferenceManager = aVar;
    }

    public static void d(LoginYtFragment loginYtFragment, bg.o oVar) {
        loginYtFragment.setAuthStateUseCase = oVar;
    }
}
