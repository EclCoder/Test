package mc;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class v extends t {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (v.this.f45732e.isEmpty()) {
                return;
            }
            outline.setPath(v.this.f45732e);
        }
    }

    v(View view) {
        l(view);
    }

    private void l(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // mc.t
    void b(View view) {
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // mc.t
    boolean j() {
        return this.f45728a;
    }
}
