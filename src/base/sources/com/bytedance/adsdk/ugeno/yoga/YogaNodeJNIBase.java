package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends ta implements Cloneable {
    private float[] arr;
    private Object dkl;
    private boolean dse;
    private dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private YogaNodeJNIBase f12421hn;
    protected long hnj;
    private int mLayoutDirection;
    private List<YogaNodeJNIBase> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private hn f12422sk;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.dse = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.hnj = j10;
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.qor;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.qor.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f12421hn = this;
        return yogaNodeJNIBase.hnj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void aq(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.hnj, f10);
    }

    public final float baseline(float f10, float f11) {
        return this.f12422sk.hnj(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void bug(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void dkl(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    /* JADX INFO: renamed from: dnm, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase hn() {
        return this.f12421hn;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void dse(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase hn(int i10) {
        List<YogaNodeJNIBase> list = this.qor;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.f12421hn = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.hnj, yogaNodeJNIBaseRemove.hnj);
        return yogaNodeJNIBaseRemove;
    }

    public final long measure(float f10, int i10, float f11, int i11) {
        if (bug()) {
            return this.gjv.hnj(this, f10, aq.hnj(i10), f11, aq.hnj(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void ojm(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase hnj(int i10) {
        List<YogaNodeJNIBase> list = this.qor;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void sk(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void ta(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public float aq() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    public boolean bug() {
        return this.gjv != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public float dkl() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void dnm(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public float dse() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public int hnj() {
        List<YogaNodeJNIBase> list = this.qor;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public float ojm() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void sk() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.hnj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public Object ta() {
        return this.dkl;
    }

    private void hn(ta taVar) {
        ta();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(ta taVar, int i10) {
        if (taVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) taVar;
            if (yogaNodeJNIBase.f12421hn == null) {
                if (this.qor == null) {
                    this.qor = new ArrayList(4);
                }
                this.qor.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.f12421hn = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.hnj, yogaNodeJNIBase.hnj, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hn(hnj hnjVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.hnj, hnjVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void qor(hnj hnjVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.hnj, hnjVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hn(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void qor(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void gjv(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hn(gjv gjvVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.hnj, gjvVar.hnj(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void qor() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.hnj);
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void gjv() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.hnj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void qor(gjv gjvVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.hnj, gjvVar.hnj(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public int hnj(ta taVar) {
        List<YogaNodeJNIBase> list = this.qor;
        if (list == null) {
            return -1;
        }
        return list.indexOf(taVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(float f10, float f11) {
        hn((ta) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.qor;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.hn(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].hnj;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.hnj, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(qor qorVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.hnj, qorVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(sk skVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.hnj, skVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(dkl dklVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.hnj, dklVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(hnj hnjVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.hnj, hnjVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(orl orlVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.hnj, orlVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(mjg mjgVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.hnj, mjgVar.hnj());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.hnj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(gjv gjvVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.hnj, gjvVar.hnj(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(dse dseVar) {
        this.gjv = dseVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.hnj, dseVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(boolean z10) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.hnj, z10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ta
    public void hnj(Object obj) {
        this.dkl = obj;
    }
}
