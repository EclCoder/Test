package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug implements orl, ta {
    private final com.bytedance.adsdk.hn.qor.hn.ojm dkl;
    private final String gjv;
    private final Path hnj = new Path();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Path f11984hn = new Path();
    private final Path qor = new Path();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final List<orl> f11985sk = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.hnj.hnj.bug$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[com.bytedance.adsdk.hn.qor.hn.ojm.hnj.values().length];
            hnj = iArr;
            try {
                iArr[com.bytedance.adsdk.hn.qor.hn.ojm.hnj.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.ojm.hnj.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.ojm.hnj.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.ojm.hnj.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.hn.ojm.hnj.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public bug(com.bytedance.adsdk.hn.qor.hn.ojm ojmVar) {
        this.gjv = ojmVar.hnj();
        this.dkl = ojmVar;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.orl
    public Path gjv() {
        this.qor.reset();
        if (this.dkl.qor()) {
            return this.qor;
        }
        int i10 = AnonymousClass1.hnj[this.dkl.hn().ordinal()];
        if (i10 == 1) {
            hnj();
        } else if (i10 == 2) {
            hnj(Path.Op.UNION);
        } else if (i10 == 3) {
            hnj(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            hnj(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            hnj(Path.Op.XOR);
        }
        return this.qor;
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.ta
    public void hnj(ListIterator<qor> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            qor qorVarPrevious = listIterator.previous();
            if (qorVarPrevious instanceof orl) {
                this.f11985sk.add((orl) qorVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.hn.hnj.hnj.qor
    public void hnj(List<qor> list, List<qor> list2) {
        for (int i10 = 0; i10 < this.f11985sk.size(); i10++) {
            this.f11985sk.get(i10).hnj(list, list2);
        }
    }

    private void hnj() {
        for (int i10 = 0; i10 < this.f11985sk.size(); i10++) {
            this.qor.addPath(this.f11985sk.get(i10).gjv());
        }
    }

    private void hnj(Path.Op op2) {
        this.f11984hn.reset();
        this.hnj.reset();
        for (int size = this.f11985sk.size() - 1; size > 0; size--) {
            orl orlVar = this.f11985sk.get(size);
            if (orlVar instanceof gjv) {
                gjv gjvVar = (gjv) orlVar;
                List<orl> listHn = gjvVar.hn();
                for (int size2 = listHn.size() - 1; size2 >= 0; size2--) {
                    Path pathGjv = listHn.get(size2).gjv();
                    pathGjv.transform(gjvVar.qor());
                    this.f11984hn.addPath(pathGjv);
                }
            } else {
                this.f11984hn.addPath(orlVar.gjv());
            }
        }
        orl orlVar2 = this.f11985sk.get(0);
        if (orlVar2 instanceof gjv) {
            gjv gjvVar2 = (gjv) orlVar2;
            List<orl> listHn2 = gjvVar2.hn();
            for (int i10 = 0; i10 < listHn2.size(); i10++) {
                Path pathGjv2 = listHn2.get(i10).gjv();
                pathGjv2.transform(gjvVar2.qor());
                this.hnj.addPath(pathGjv2);
            }
        } else {
            this.hnj.set(orlVar2.gjv());
        }
        this.qor.op(this.hnj, this.f11984hn, op2);
    }
}
