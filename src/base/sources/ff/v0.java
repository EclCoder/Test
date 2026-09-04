package ff;

import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v0 extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lf.i f38573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f38574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NativeAdView f38575e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            FrameLayout frameLayout = v0.this.f38574d;
            if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            lf.i iVar = v0.this.f38573c;
            if (iVar != null) {
                iVar.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 A0(v0 v0Var) {
        v0Var.finish();
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        super.onCreate(bundle);
        setFinishOnTouchOutside(true);
        if (nh.l0.o() || !nh.l0.f47742a.k()) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ads_container);
        this.f38574d = frameLayout;
        this.f38575e = frameLayout != null ? (NativeAdView) frameLayout.findViewById(R.id.google_ad_container) : null;
        lf.i iVar = new lf.i(lf.l.f44461f.a(lf.l.a.REVIEW), lf.c.f44397g.a(lf.c.a.REVIEW), this.f38574d, this.f38575e, new tl.a() { // from class: ff.u0
            @Override // tl.a
            public final Object invoke() {
                return v0.A0(this.f38569a);
            }
        }, false, 32, null);
        this.f38573c = iVar;
        iVar.i();
        FrameLayout frameLayout2 = this.f38574d;
        if (frameLayout2 == null || (viewTreeObserver = frameLayout2.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        lf.i iVar = this.f38573c;
        if (iVar != null) {
            iVar.h();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        lf.i iVar = this.f38573c;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        super.onResume();
        lf.i iVar = this.f38573c;
        if (iVar != null) {
            iVar.j();
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        finish();
    }
}
