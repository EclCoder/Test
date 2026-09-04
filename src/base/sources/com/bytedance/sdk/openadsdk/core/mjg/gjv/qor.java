package com.bytedance.sdk.openadsdk.core.mjg.gjv;

import com.bykv.vk.openvk.hnj.hnj.hn.qor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u6.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends a {
    private final hnj gjv;
    private final List<hn> hnj = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13786hn = 1;
    private int qor = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn extends b.a {
        @Override // u6.b.a
        /* synthetic */ void gjv(b bVar);

        @Override // u6.b.a
        /* synthetic */ void hn(b bVar);

        @Override // u6.b.a
        /* synthetic */ void hn(b bVar, int i10);

        void hnj(int i10, int i11);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, int i10);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, int i10, int i11);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, int i10, int i11, int i12);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, long j10);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, long j10, long j11);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar2);

        @Override // u6.b.a
        /* synthetic */ void hnj(b bVar, boolean z10);

        @Override // u6.b.a
        /* synthetic */ void qor(b bVar);

        @Override // u6.b.a
        /* synthetic */ void sk(b bVar);
    }

    public qor() {
        hnj hnjVar = new hnj();
        this.gjv = hnjVar;
        super.hnj(hnjVar);
        hnj(500);
    }

    static /* synthetic */ int hnj(qor qorVar) {
        int i10 = qorVar.qor;
        qorVar.qor = i10 + 1;
        return i10;
    }

    public int eum() {
        return this.qor;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.a
    public long oj() {
        long jOj = super.oj();
        return this.f13786hn == 1 ? jOj : jOj + (((long) (this.qor - 1)) * super.uua());
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.a
    public long uua() {
        return super.uua() * ((long) this.f13786hn);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj implements b.a {
        private hnj() {
        }

        @Override // u6.b.a
        public void gjv(b bVar) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).gjv(bVar);
            }
        }

        @Override // u6.b.a
        public void hn(b bVar) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hn(bVar);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar) {
            qor.hnj(qor.this);
            if (qor.this.qor > qor.this.f13786hn) {
                Iterator it = qor.this.hnj.iterator();
                while (it.hasNext()) {
                    ((hn) it.next()).hnj(bVar);
                }
            } else {
                Iterator it2 = qor.this.hnj.iterator();
                while (it2.hasNext()) {
                    ((hn) it2.next()).hnj(qor.this.qor, qor.this.f13786hn);
                }
                qor.this.ojm();
            }
        }

        @Override // u6.b.a
        public void qor(b bVar) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).qor(bVar);
            }
        }

        @Override // u6.b.a
        public void sk(b bVar) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).sk(bVar);
            }
        }

        @Override // u6.b.a
        public void hn(b bVar, int i10) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hn(bVar, i10);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, long j10) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, j10);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar2) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, bVar2);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, boolean z10) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, z10);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, int i10, int i11) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, i10, i11);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, int i10, int i11, int i12) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, i10, i11, i12);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, int i10) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, i10);
            }
        }

        @Override // u6.b.a
        public void hnj(b bVar, long j10, long j11) {
            Iterator it = qor.this.hnj.iterator();
            while (it.hasNext()) {
                ((hn) it.next()).hnj(bVar, j10, j11);
            }
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.a
    public void hnj(b.a aVar) {
        if (!(aVar instanceof hn)) {
            super.hnj(aVar);
        } else {
            if (this.hnj.contains(aVar)) {
                return;
            }
            this.hnj.add((hn) aVar);
        }
    }

    public void qor(int i10) {
        this.f13786hn = Math.max(1, i10);
    }
}
