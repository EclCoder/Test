package com.bytedance.adsdk.hn.hnj.hn;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj<K, A> {
    protected com.bytedance.adsdk.hn.dse.hn<A> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final qor<K> f11965sk;
    final List<InterfaceC0162hnj> hnj = new ArrayList(1);
    private boolean gjv = false;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected float f11964hn = 0.0f;
    private A dkl = null;
    private float dse = -1.0f;
    private float aq = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class gjv<T> implements qor<T> {
        private final List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> hnj;
        private com.bytedance.adsdk.hn.dse.hnj<T> qor = null;
        private float gjv = -1.0f;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private com.bytedance.adsdk.hn.dse.hnj<T> f11966hn = qor(0.0f);

        gjv(List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> list) {
            this.hnj = list;
        }

        private com.bytedance.adsdk.hn.dse.hnj<T> qor(float f10) {
            List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> list = this.hnj;
            com.bytedance.adsdk.hn.dse.hnj<T> hnjVar = list.get(list.size() - 1);
            if (f10 >= hnjVar.qor()) {
                return hnjVar;
            }
            for (int size = this.hnj.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.hn.dse.hnj<T> hnjVar2 = this.hnj.get(size);
                if (this.f11966hn != hnjVar2 && hnjVar2.hnj(f10)) {
                    return hnjVar2;
                }
            }
            return this.hnj.get(0);
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public float gjv() {
            List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> list = this.hnj;
            return list.get(list.size() - 1).gjv();
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public com.bytedance.adsdk.hn.dse.hnj<T> hn() {
            return this.f11966hn;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hnj() {
            return false;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hn(float f10) {
            com.bytedance.adsdk.hn.dse.hnj<T> hnjVar = this.qor;
            com.bytedance.adsdk.hn.dse.hnj<T> hnjVar2 = this.f11966hn;
            if (hnjVar == hnjVar2 && this.gjv == f10) {
                return true;
            }
            this.qor = hnjVar2;
            this.gjv = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hnj(float f10) {
            if (this.f11966hn.hnj(f10)) {
                return !this.f11966hn.sk();
            }
            this.f11966hn = qor(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public float qor() {
            return this.hnj.get(0).qor();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hn<T> implements qor<T> {
        private hn() {
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public float gjv() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public com.bytedance.adsdk.hn.dse.hnj<T> hn() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hnj() {
            return true;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public float qor() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hn(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hnj(float f10) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.hnj.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0162hnj {
        void hnj();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface qor<T> {
        float gjv();

        com.bytedance.adsdk.hn.dse.hnj<T> hn();

        boolean hn(float f10);

        boolean hnj();

        boolean hnj(float f10);

        float qor();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class sk<T> implements qor<T> {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private float f11967hn = -1.0f;
        private final com.bytedance.adsdk.hn.dse.hnj<T> hnj;

        sk(List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> list) {
            this.hnj = list.get(0);
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public float gjv() {
            return this.hnj.gjv();
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public com.bytedance.adsdk.hn.dse.hnj<T> hn() {
            return this.hnj;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hnj() {
            return false;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public float qor() {
            return this.hnj.qor();
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hn(float f10) {
            if (this.f11967hn == f10) {
                return true;
            }
            this.f11967hn = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.hn.hnj.hn.hnj.qor
        public boolean hnj(float f10) {
            return !this.hnj.sk();
        }
    }

    hnj(List<? extends com.bytedance.adsdk.hn.dse.hnj<K>> list) {
        this.f11965sk = hnj(list);
    }

    private float ojm() {
        if (this.dse == -1.0f) {
            this.dse = this.f11965sk.qor();
        }
        return this.dse;
    }

    public float aq() {
        return this.f11964hn;
    }

    float dkl() {
        if (this.aq == -1.0f) {
            this.aq = this.f11965sk.gjv();
        }
        return this.aq;
    }

    public A dse() {
        float fGjv = gjv();
        if (this.qor == null && this.f11965sk.hn(fGjv)) {
            return this.dkl;
        }
        com.bytedance.adsdk.hn.dse.hnj<K> hnjVarQor = qor();
        Interpolator interpolator = hnjVarQor.gjv;
        A aHnj = (interpolator == null || hnjVarQor.f11947sk == null) ? hnj(hnjVarQor, sk()) : hnj(hnjVarQor, fGjv, interpolator.getInterpolation(fGjv), hnjVarQor.f11947sk.getInterpolation(fGjv));
        this.dkl = aHnj;
        return aHnj;
    }

    float gjv() {
        if (this.gjv) {
            return 0.0f;
        }
        com.bytedance.adsdk.hn.dse.hnj<K> hnjVarQor = qor();
        if (hnjVarQor.sk()) {
            return 0.0f;
        }
        return (this.f11964hn - hnjVarQor.qor()) / (hnjVarQor.gjv() - hnjVarQor.qor());
    }

    public void hn() {
        for (int i10 = 0; i10 < this.hnj.size(); i10++) {
            this.hnj.get(i10).hnj();
        }
    }

    abstract A hnj(com.bytedance.adsdk.hn.dse.hnj<K> hnjVar, float f10);

    public void hnj() {
        this.gjv = true;
    }

    protected com.bytedance.adsdk.hn.dse.hnj<K> qor() {
        com.bytedance.adsdk.hn.sk.hnj("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.hn.dse.hnj<K> hnjVarHn = this.f11965sk.hn();
        com.bytedance.adsdk.hn.sk.hn("BaseKeyframeAnimation#getCurrentKeyframe");
        return hnjVarHn;
    }

    protected float sk() {
        com.bytedance.adsdk.hn.dse.hnj<K> hnjVarQor = qor();
        if (hnjVarQor == null || hnjVarQor.sk()) {
            return 0.0f;
        }
        return hnjVarQor.qor.getInterpolation(gjv());
    }

    public void hnj(InterfaceC0162hnj interfaceC0162hnj) {
        this.hnj.add(interfaceC0162hnj);
    }

    public void hnj(float f10) {
        if (this.f11965sk.hnj()) {
            return;
        }
        if (f10 < ojm()) {
            f10 = ojm();
        } else if (f10 > dkl()) {
            f10 = dkl();
        }
        if (f10 == this.f11964hn) {
            return;
        }
        this.f11964hn = f10;
        if (this.f11965sk.hnj(f10)) {
            hn();
        }
    }

    protected A hnj(com.bytedance.adsdk.hn.dse.hnj<K> hnjVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> qor<T> hnj(List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> list) {
        if (list.isEmpty()) {
            return new hn();
        }
        if (list.size() == 1) {
            return new sk(list);
        }
        return new gjv(list);
    }
}
