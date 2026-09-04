package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class l extends m {
    l(b bVar) {
        super(bVar);
    }

    @Override // pl.droidsonroids.gif.m
    public void a() {
        b bVar = this.f50249a;
        long jS = bVar.f50191g.s(bVar.f50190f);
        if (jS >= 0) {
            this.f50249a.f50187c = SystemClock.uptimeMillis() + jS;
            if (this.f50249a.isVisible() && this.f50249a.f50186b) {
                b bVar2 = this.f50249a;
                if (!bVar2.f50196l) {
                    bVar2.f50185a.remove(this);
                    b bVar3 = this.f50249a;
                    bVar3.f50200p = bVar3.f50185a.schedule(this, jS, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f50249a.f50192h.isEmpty() && this.f50249a.b() == this.f50249a.f50191g.j() - 1) {
                b bVar4 = this.f50249a;
                bVar4.f50197m.sendEmptyMessageAtTime(bVar4.c(), this.f50249a.f50187c);
            }
        } else {
            b bVar5 = this.f50249a;
            bVar5.f50187c = Long.MIN_VALUE;
            bVar5.f50186b = false;
        }
        if (!this.f50249a.isVisible() || this.f50249a.f50197m.hasMessages(-1)) {
            return;
        }
        this.f50249a.f50197m.sendEmptyMessageAtTime(-1, 0L);
    }
}
