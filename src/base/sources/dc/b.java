package dc;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.pGX.geAgcEazw;
import com.google.firebase.installations.ktx.gUsI.dmHT;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f36610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36611b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36612c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f36610a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f36610a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f36610a);
        }
    }

    public int b() {
        return this.f36612c;
    }

    public boolean c() {
        return this.f36611b;
    }

    public void f(int i10) {
        this.f36612c = i10;
    }

    public void d(Bundle bundle) {
        this.f36611b = bundle.getBoolean("expanded", false);
        this.f36612c = bundle.getInt(geAgcEazw.SUOpAsDoHI, 0);
        if (this.f36611b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f36611b);
        bundle.putInt(dmHT.REiJpVnIHQfYzBr, this.f36612c);
        return bundle;
    }
}
