package com.bytedance.adsdk.ugeno.sk;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class gjv {
    static final /* synthetic */ boolean qor = true;
    private long[] dkl;
    private final com.bytedance.adsdk.ugeno.sk.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    long[] f12402hn;
    int[] hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean[] f12403sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements Comparable<hn> {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f12404hn;
        int hnj;

        private hn() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int compareTo(hn hnVar) {
            int i10 = this.f12404hn;
            int i11 = hnVar.f12404hn;
            return i10 != i11 ? i10 - i11 : this.hnj - hnVar.hnj;
        }

        public String toString() {
            return "Order{order=" + this.f12404hn + ", index=" + this.hnj + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f12405hn;
        List<qor> hnj;

        hnj() {
        }

        void hnj() {
            this.hnj = null;
            this.f12405hn = 0;
        }
    }

    gjv(com.bytedance.adsdk.ugeno.sk.hnj hnjVar) {
        this.gjv = hnjVar;
    }

    private int dkl(com.bytedance.adsdk.ugeno.sk.hn hnVar, boolean z10) {
        return z10 ? hnVar.jip() : hnVar.fc();
    }

    private int gjv(boolean z10) {
        return z10 ? this.gjv.getPaddingBottom() : this.gjv.getPaddingEnd();
    }

    private int qor(boolean z10) {
        return z10 ? this.gjv.getPaddingTop() : this.gjv.getPaddingStart();
    }

    private int sk(com.bytedance.adsdk.ugeno.sk.hn hnVar, boolean z10) {
        return z10 ? hnVar.mjg() : hnVar.orl();
    }

    int hn(long j10) {
        return (int) (j10 >> 32);
    }

    int hnj(long j10) {
        return (int) j10;
    }

    long hn(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] hnj(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.gjv.getFlexItemCount();
        List<hn> listHn = hn(flexItemCount);
        hn hnVar = new hn();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.sk.hn)) {
            hnVar.f12404hn = 1;
        } else {
            hnVar.f12404hn = ((com.bytedance.adsdk.ugeno.sk.hn) layoutParams).qor();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.gjv.getFlexItemCount()) {
            hnVar.hnj = flexItemCount;
        } else {
            hnVar.hnj = i10;
            while (i10 < flexItemCount) {
                listHn.get(i10).hnj++;
                i10++;
            }
        }
        listHn.add(hnVar);
        return hnj(flexItemCount + 1, listHn, sparseIntArray);
    }

    private int gjv(com.bytedance.adsdk.ugeno.sk.hn hnVar, boolean z10) {
        if (z10) {
            return hnVar.fc();
        }
        return hnVar.jip();
    }

    private List<hn> hn(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) this.gjv.hnj(i11).getLayoutParams();
            hn hnVar2 = new hn();
            hnVar2.f12404hn = hnVar.qor();
            hnVar2.hnj = i11;
            arrayList.add(hnVar2);
        }
        return arrayList;
    }

    private int qor(com.bytedance.adsdk.ugeno.sk.hn hnVar, boolean z10) {
        if (z10) {
            return hnVar.orl();
        }
        return hnVar.mjg();
    }

    private void qor(int i10) {
        boolean[] zArr = this.f12403sk;
        if (zArr == null) {
            this.f12403sk = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f12403sk = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    boolean hn(SparseIntArray sparseIntArray) {
        int flexItemCount = this.gjv.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewHnj = this.gjv.hnj(i10);
            if (viewHnj != null && ((com.bytedance.adsdk.ugeno.sk.hn) viewHnj.getLayoutParams()).qor() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    void hn(hnj hnjVar, int i10, int i11) {
        hnj(hnjVar, i11, i10, Integer.MAX_VALUE, 0, -1, (List<qor>) null);
    }

    private int hn(boolean z10) {
        if (z10) {
            return this.gjv.getPaddingEnd();
        }
        return this.gjv.getPaddingBottom();
    }

    int[] hnj(SparseIntArray sparseIntArray) {
        int flexItemCount = this.gjv.getFlexItemCount();
        return hnj(flexItemCount, hn(flexItemCount), sparseIntArray);
    }

    private int hn(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] hnj(int i10, List<hn> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (hn hnVar : list) {
            int i12 = hnVar.hnj;
            iArr[i11] = i12;
            sparseIntArray.append(i12, hnVar.f12404hn);
            i11++;
        }
        return iArr;
    }

    private int hn(com.bytedance.adsdk.ugeno.sk.hn hnVar, boolean z10) {
        if (z10) {
            return hnVar.hn();
        }
        return hnVar.hnj();
    }

    private void hn(int i10, int i11, qor qorVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iDse;
        int i14 = qorVar.f12409sk;
        float f12 = qorVar.dnm;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        qorVar.f12409sk = i13 + qorVar.dkl;
        if (!z10) {
            qorVar.dse = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < qorVar.aq) {
            int i17 = qorVar.f12406fc + i15;
            View viewHn = this.gjv.hn(i17);
            if (viewHn == null || viewHn.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) viewHn.getLayoutParams();
                int flexDirection = this.gjv.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewHn.getMeasuredHeight();
                    long[] jArr = this.dkl;
                    if (jArr != null) {
                        measuredHeight = hn(jArr[i17]);
                    }
                    int measuredWidth = viewHn.getMeasuredWidth();
                    long[] jArr2 = this.dkl;
                    if (jArr2 != null) {
                        measuredWidth = hnj(jArr2[i17]);
                    }
                    if (!this.f12403sk[i17] && hnVar.sk() > f10) {
                        float fSk = measuredHeight - (hnVar.sk() * f14);
                        if (i15 == qorVar.aq - 1) {
                            fSk += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fSk);
                        if (iRound < hnVar.aq()) {
                            iRound = hnVar.aq();
                            this.f12403sk[i17] = true;
                            qorVar.dnm -= hnVar.sk();
                            z11 = true;
                        } else {
                            f15 += fSk - iRound;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                iRound++;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f15 += 1.0f;
                            }
                        }
                        int iHnj = hnj(i10, hnVar, qorVar.orl);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewHn.measure(iHnj, iMakeMeasureSpec);
                        int measuredWidth2 = viewHn.getMeasuredWidth();
                        int measuredHeight2 = viewHn.getMeasuredHeight();
                        hnj(i17, iHnj, iMakeMeasureSpec, viewHn);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + hnVar.orl() + hnVar.fc() + this.gjv.hnj(viewHn));
                    qorVar.f12409sk += measuredHeight + hnVar.mjg() + hnVar.jip();
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewHn.getMeasuredWidth();
                    long[] jArr3 = this.dkl;
                    if (jArr3 != null) {
                        measuredWidth3 = hnj(jArr3[i17]);
                    }
                    int measuredHeight3 = viewHn.getMeasuredHeight();
                    long[] jArr4 = this.dkl;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = hn(jArr4[i17]);
                    }
                    if (!this.f12403sk[i17] && hnVar.sk() > f10) {
                        float fSk2 = measuredWidth3 - (f11 * hnVar.sk());
                        if (i15 == qorVar.aq - 1) {
                            fSk2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fSk2);
                        if (iRound2 < hnVar.dse()) {
                            iDse = hnVar.dse();
                            this.f12403sk[i17] = true;
                            qorVar.dnm -= hnVar.sk();
                            z11 = true;
                        } else {
                            f15 += fSk2 - iRound2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                iDse = iRound2 + 1;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iDse = iRound2 - 1;
                                f15 += 1.0f;
                            } else {
                                iDse = iRound2;
                            }
                        }
                        int iHn = hn(i11, hnVar, qorVar.orl);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iDse, 1073741824);
                        viewHn.measure(iMakeMeasureSpec2, iHn);
                        int measuredWidth4 = viewHn.getMeasuredWidth();
                        int measuredHeight4 = viewHn.getMeasuredHeight();
                        hnj(i17, iMakeMeasureSpec2, iHn, viewHn);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + hnVar.mjg() + hnVar.jip() + this.gjv.hnj(viewHn));
                    qorVar.f12409sk += measuredWidth3 + hnVar.orl() + hnVar.fc();
                    iMax = iMax2;
                }
                qorVar.dse = Math.max(qorVar.dse, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == qorVar.f12409sk) {
            return;
        }
        hn(i10, i11, qorVar, i12, i13, true);
    }

    void hnj(hnj hnjVar, int i10, int i11) {
        hnj(hnjVar, i10, i11, Integer.MAX_VALUE, 0, -1, (List<qor>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void hnj(hnj hnjVar, int i10, int i11, int i12, int i13, int i14, List<qor> list) {
        int i15;
        int i16;
        int i17;
        int i18;
        int iHnj;
        int i19;
        int i20;
        int i21;
        qor qorVar;
        int i22;
        int i23;
        boolean z10;
        int i24;
        boolean z11;
        int i25;
        int i26 = i10;
        boolean zHnj = this.gjv.hnj();
        int mode = View.MeasureSpec.getMode(i26);
        int size = View.MeasureSpec.getSize(i26);
        List<qor> arrayList = list == null ? new ArrayList() : list;
        hnjVar.hnj = arrayList;
        boolean z12 = i14 == -1;
        int iHnj2 = hnj(zHnj);
        int iHn = hn(zHnj);
        int iQor = qor(zHnj);
        int iGjv = gjv(zHnj);
        qor qorVar2 = new qor();
        int i27 = i13;
        qorVar2.f12406fc = i27;
        int i28 = iHnj2 + iHn;
        qorVar2.f12409sk = i28;
        int flexItemCount = this.gjv.getFlexItemCount();
        boolean z13 = z12;
        qor qorVar3 = qorVar2;
        int i29 = Integer.MIN_VALUE;
        int i30 = 0;
        int iCombineMeasuredStates = 0;
        int i31 = 0;
        while (i27 < flexItemCount) {
            View viewHn = this.gjv.hn(i27);
            if (viewHn == null) {
                if (hnj(i27, flexItemCount, qorVar3)) {
                    hnj(arrayList, qorVar3, i27, i30);
                }
                i16 = i28;
            } else {
                i16 = i28;
                if (viewHn.getVisibility() == 8) {
                    qorVar3.ojm++;
                    qorVar3.aq++;
                    if (hnj(i27, flexItemCount, qorVar3)) {
                        hnj(arrayList, qorVar3, i27, i30);
                    }
                } else {
                    if (viewHn instanceof CompoundButton) {
                        hnj((CompoundButton) viewHn);
                    }
                    com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) viewHn.getLayoutParams();
                    int i32 = flexItemCount;
                    if (hnVar.dkl() == 4) {
                        qorVar3.mjg.add(Integer.valueOf(i27));
                    }
                    int iHnj3 = hnj(hnVar, zHnj);
                    if (hnVar.bug() != -1.0f && mode == 1073741824) {
                        iHnj3 = Math.round(size * hnVar.bug());
                    }
                    if (zHnj) {
                        iHnj = this.gjv.hnj(i26, i16 + qor(hnVar, true) + gjv(hnVar, true), iHnj3);
                        i17 = i30;
                        int iHn2 = this.gjv.hn(i11, iQor + iGjv + sk(hnVar, true) + dkl(hnVar, true) + i30, hn(hnVar, true));
                        viewHn.measure(iHnj, iHn2);
                        hnj(i27, iHnj, iHn2, viewHn);
                        i18 = 0;
                    } else {
                        i17 = i30;
                        i18 = 0;
                        int iHnj4 = this.gjv.hnj(i11, iQor + iGjv + sk(hnVar, false) + dkl(hnVar, false) + i17, hn(hnVar, false));
                        int iHn3 = this.gjv.hn(i26, i16 + qor(hnVar, false) + gjv(hnVar, false), iHnj3);
                        viewHn.measure(iHnj4, iHn3);
                        hnj(i27, iHnj4, iHn3, viewHn);
                        iHnj = iHn3;
                    }
                    hnj(viewHn, i27);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewHn.getMeasuredState());
                    int i33 = i18;
                    i19 = i27;
                    int i34 = iHnj;
                    qor qorVar4 = qorVar3;
                    int i35 = i31;
                    i20 = i16;
                    i21 = i17;
                    boolean z14 = zHnj;
                    size = size;
                    if (hnj(viewHn, mode, size, qorVar3.f12409sk, hnj(viewHn, zHnj) + qor(hnVar, zHnj) + gjv(hnVar, zHnj), hnVar, i19, i35, arrayList.size())) {
                        if (qorVar4.hn() > 0) {
                            hnj(arrayList, qorVar4, i19 > 0 ? i19 - 1 : i33, i21);
                            i25 = i21 + qorVar4.dse;
                        } else {
                            i25 = i21;
                        }
                        if (z14) {
                            if (hnVar.hn() == -1) {
                                com.bytedance.adsdk.ugeno.sk.hnj hnjVar2 = this.gjv;
                                viewHn.measure(i34, hnjVar2.hn(i11, hnjVar2.getPaddingTop() + this.gjv.getPaddingBottom() + hnVar.mjg() + hnVar.jip() + i25, hnVar.hn()));
                                hnj(viewHn, i19);
                            }
                        } else if (hnVar.hnj() == -1) {
                            com.bytedance.adsdk.ugeno.sk.hnj hnjVar3 = this.gjv;
                            viewHn.measure(hnjVar3.hnj(i11, hnjVar3.getPaddingLeft() + this.gjv.getPaddingRight() + hnVar.orl() + hnVar.fc() + i25, hnVar.hnj()), i34);
                            hnj(viewHn, i19);
                        }
                        qor qorVar5 = new qor();
                        qorVar5.aq = 1;
                        qorVar5.f12409sk = i20;
                        qorVar5.f12406fc = i19;
                        i21 = i25;
                        i22 = i33;
                        qorVar = qorVar5;
                        i23 = Integer.MIN_VALUE;
                    } else {
                        qorVar = qorVar4;
                        qorVar.aq++;
                        i22 = i35 + 1;
                        i23 = i29;
                    }
                    qorVar.uua = (qorVar.uua ? 1 : 0) | (hnVar.gjv() != 0.0f ? 1 : i33);
                    qorVar.f12408oj = (qorVar.f12408oj ? 1 : 0) | (hnVar.sk() != 0.0f ? 1 : i33);
                    int[] iArr = this.hnj;
                    if (iArr != null) {
                        iArr[i19] = arrayList.size();
                    }
                    z10 = z14;
                    qorVar.f12409sk += hnj(viewHn, z10) + qor(hnVar, z10) + gjv(hnVar, z10);
                    qorVar.f12410ta += hnVar.gjv();
                    qorVar.dnm += hnVar.sk();
                    this.gjv.hnj(viewHn, i19, i22, qorVar);
                    int iMax = Math.max(i23, hn(viewHn, z10) + sk(hnVar, z10) + dkl(hnVar, z10) + this.gjv.hnj(viewHn));
                    qorVar.dse = Math.max(qorVar.dse, iMax);
                    if (z10) {
                        if (this.gjv.getFlexWrap() != 2) {
                            qorVar.bug = Math.max(qorVar.bug, viewHn.getBaseline() + hnVar.mjg());
                        } else {
                            qorVar.bug = Math.max(qorVar.bug, (viewHn.getMeasuredHeight() - viewHn.getBaseline()) + hnVar.jip());
                        }
                    }
                    i24 = i32;
                    if (hnj(i19, i24, qorVar)) {
                        hnj(arrayList, qorVar, i19, i21);
                        i21 += qorVar.dse;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).jip >= i14 && i19 >= i14 && !z13) {
                            i21 = -qorVar.hnj();
                            z11 = true;
                        }
                        if (i21 <= i12 && z11) {
                            i15 = iCombineMeasuredStates;
                            hnjVar.f12405hn = i15;
                        } else {
                            i29 = iMax;
                            z13 = z11;
                            i31 = i22;
                        }
                    }
                    z11 = z13;
                    if (i21 <= i12) {
                    }
                    i29 = iMax;
                    z13 = z11;
                    i31 = i22;
                }
                int i36 = i19 + 1;
                zHnj = z10;
                qorVar3 = qorVar;
                i28 = i20;
                i30 = i21;
                i26 = i10;
                flexItemCount = i24;
                i27 = i36;
                mode = mode;
            }
            i19 = i27;
            mode = mode;
            i24 = flexItemCount;
            i21 = i30;
            z10 = zHnj;
            i20 = i16;
            qorVar = qorVar3;
            int i37 = i19 + 1;
            zHnj = z10;
            qorVar3 = qorVar;
            i28 = i20;
            i30 = i21;
            i26 = i10;
            flexItemCount = i24;
            i27 = i37;
            mode = mode;
        }
        i15 = iCombineMeasuredStates;
        hnjVar.f12405hn = i15;
    }

    private int hn(int i10, com.bytedance.adsdk.ugeno.sk.hn hnVar, int i11) {
        com.bytedance.adsdk.ugeno.sk.hnj hnjVar = this.gjv;
        int iHn = hnjVar.hn(i10, hnjVar.getPaddingTop() + this.gjv.getPaddingBottom() + hnVar.mjg() + hnVar.jip() + i11, hnVar.hn());
        int size = View.MeasureSpec.getSize(iHn);
        if (size > hnVar.ta()) {
            return View.MeasureSpec.makeMeasureSpec(hnVar.ta(), View.MeasureSpec.getMode(iHn));
        }
        return size < hnVar.aq() ? View.MeasureSpec.makeMeasureSpec(hnVar.aq(), View.MeasureSpec.getMode(iHn)) : iHn;
    }

    void hn(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.gjv.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<qor> flexLinesInternal = this.gjv.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.gjv.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).dse = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.gjv.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    qor qorVar = new qor();
                    qorVar.dse = i14;
                    flexLinesInternal.add(0, qorVar);
                    return;
                }
                if (alignContent == 2) {
                    this.gjv.setFlexLines(hnj(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                qor qorVar2 = new qor();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    qorVar2.dse = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    qorVar2.dse = Math.round(size3);
                                }
                                int i15 = qorVar2.dse;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    qorVar2.dse = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    qorVar2.dse = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(qorVar2);
                            }
                            i13++;
                        }
                        this.gjv.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.gjv.setFlexLines(hnj(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    qor qorVar3 = new qor();
                    qorVar3.dse = size5;
                    for (qor qorVar4 : flexLinesInternal) {
                        arrayList2.add(qorVar3);
                        arrayList2.add(qorVar4);
                        arrayList2.add(qorVar3);
                    }
                    this.gjv.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        qor qorVar5 = flexLinesInternal.get(i13);
                        float f12 = qorVar5.dse + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        qorVar5.dse = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void hnj(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) compoundButton.getLayoutParams();
        int iDse = hnVar.dse();
        int iAq = hnVar.aq();
        Drawable drawableHnj = com.bytedance.adsdk.ugeno.dse.sk.hnj(compoundButton);
        int minimumWidth = drawableHnj == null ? 0 : drawableHnj.getMinimumWidth();
        int minimumHeight = drawableHnj != null ? drawableHnj.getMinimumHeight() : 0;
        if (iDse == -1) {
            iDse = minimumWidth;
        }
        hnVar.hnj(iDse);
        if (iAq == -1) {
            iAq = minimumHeight;
        }
        hnVar.hn(iAq);
    }

    private int hnj(boolean z10) {
        if (z10) {
            return this.gjv.getPaddingStart();
        }
        return this.gjv.getPaddingTop();
    }

    private int hnj(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void hn(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - hnVar.orl()) - hnVar.fc()) - this.gjv.hnj(view), hnVar.dse()), hnVar.ojm());
        long[] jArr = this.dkl;
        if (jArr != null) {
            measuredHeight = hn(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        hnj(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int hnj(com.bytedance.adsdk.ugeno.sk.hn hnVar, boolean z10) {
        if (z10) {
            return hnVar.hnj();
        }
        return hnVar.hn();
    }

    private boolean hnj(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.sk.hn hnVar, int i14, int i15, int i16) {
        if (this.gjv.getFlexWrap() == 0) {
            return false;
        }
        if (hnVar.dnm()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.gjv.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iHnj = this.gjv.hnj(view, i14, i15);
        if (iHnj > 0) {
            i13 += iHnj;
        }
        return i11 < i12 + i13;
    }

    private boolean hnj(int i10, int i11, qor qorVar) {
        return i10 == i11 - 1 && qorVar.hn() != 0;
    }

    private void hnj(List<qor> list, qor qorVar, int i10, int i11) {
        qorVar.orl = i11;
        this.gjv.hnj(qorVar);
        qorVar.jip = i10;
        list.add(qorVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void hnj(View view, int i10) {
        boolean z10;
        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z11 = true;
        if (measuredWidth < hnVar.dse()) {
            measuredWidth = hnVar.dse();
        } else {
            if (measuredWidth > hnVar.ojm()) {
                measuredWidth = hnVar.ojm();
            } else {
                z10 = false;
            }
            if (measuredHeight < hnVar.aq()) {
                measuredHeight = hnVar.aq();
            } else if (measuredHeight > hnVar.ta()) {
                measuredHeight = hnVar.ta();
            } else {
                z11 = z10;
            }
            if (z11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                hnj(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z10 = true;
        if (measuredHeight < hnVar.aq()) {
            measuredHeight = hnVar.aq();
        } else if (measuredHeight > hnVar.ta()) {
            measuredHeight = hnVar.ta();
        } else {
            z11 = z10;
        }
        if (z11) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            hnj(i10, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    void hnj(int i10, int i11) {
        hnj(i10, i11, 0);
    }

    void hnj(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        qor(this.gjv.getFlexItemCount());
        if (i12 >= this.gjv.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.gjv.getFlexDirection();
        int flexDirection2 = this.gjv.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.gjv.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.gjv.getPaddingLeft();
            paddingRight = this.gjv.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.gjv.getLargestMainSize();
            }
            paddingLeft = this.gjv.getPaddingTop();
            paddingRight = this.gjv.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.hnj;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<qor> flexLinesInternal = this.gjv.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            qor qorVar = flexLinesInternal.get(i17);
            int i18 = qorVar.f12409sk;
            if (i18 < i16 && qorVar.uua) {
                i13 = i10;
                i14 = i11;
                hnj(i13, i14, qorVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && qorVar.f12408oj) {
                    hn(i13, i14, qorVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void hnj(int i10, int i11, qor qorVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = qorVar.f12410ta;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = qorVar.f12409sk)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        qorVar.f12409sk = i13 + qorVar.dkl;
        if (!z10) {
            qorVar.dse = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < qorVar.aq) {
            int i17 = qorVar.f12406fc + i15;
            View viewHn = this.gjv.hn(i17);
            if (viewHn == null || viewHn.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) viewHn.getLayoutParams();
                int flexDirection = this.gjv.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewHn.getMeasuredHeight();
                    long[] jArr = this.dkl;
                    if (jArr != null) {
                        measuredHeight = hn(jArr[i17]);
                    }
                    int measuredWidth = viewHn.getMeasuredWidth();
                    long[] jArr2 = this.dkl;
                    f11 = f14;
                    boolean z12 = z11;
                    if (jArr2 != null) {
                        measuredWidth = hnj(jArr2[i17]);
                    }
                    if (this.f12403sk[i17] || hnVar.gjv() <= f10) {
                        z11 = z12;
                    } else {
                        float fGjv = measuredHeight + (hnVar.gjv() * f11);
                        if (i15 == qorVar.aq - 1) {
                            fGjv += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fGjv);
                        if (iRound > hnVar.ta()) {
                            iRound = hnVar.ta();
                            this.f12403sk[i17] = true;
                            qorVar.f12410ta -= hnVar.gjv();
                            z11 = true;
                        } else {
                            f15 += fGjv - iRound;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                z11 = z12;
                            }
                            f15 = (float) d11;
                            z11 = z12;
                        }
                        int iHnj = hnj(i10, hnVar, qorVar.orl);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewHn.measure(iHnj, iMakeMeasureSpec);
                        int measuredWidth2 = viewHn.getMeasuredWidth();
                        int measuredHeight2 = viewHn.getMeasuredHeight();
                        hnj(i17, iHnj, iMakeMeasureSpec, viewHn);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + hnVar.orl() + hnVar.fc() + this.gjv.hnj(viewHn));
                    qorVar.f12409sk += measuredHeight + hnVar.mjg() + hnVar.jip();
                } else {
                    f11 = f14;
                    boolean z13 = z11;
                    int measuredWidth3 = viewHn.getMeasuredWidth();
                    long[] jArr3 = this.dkl;
                    if (jArr3 != null) {
                        measuredWidth3 = hnj(jArr3[i17]);
                    }
                    int measuredHeight3 = viewHn.getMeasuredHeight();
                    long[] jArr4 = this.dkl;
                    if (jArr4 != null) {
                        measuredHeight3 = hn(jArr4[i17]);
                    }
                    if (this.f12403sk[i17] || hnVar.gjv() <= f10) {
                        z11 = z13;
                    } else {
                        float fGjv2 = measuredWidth3 + (hnVar.gjv() * f11);
                        if (i15 == qorVar.aq - 1) {
                            fGjv2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fGjv2);
                        if (iRound2 > hnVar.ojm()) {
                            iRound2 = hnVar.ojm();
                            this.f12403sk[i17] = true;
                            qorVar.f12410ta -= hnVar.gjv();
                            z11 = true;
                        } else {
                            f15 += fGjv2 - iRound2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                z11 = z13;
                            }
                            f15 = (float) d10;
                            z11 = z13;
                        }
                        int iHn = hn(i11, hnVar, qorVar.orl);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewHn.measure(iMakeMeasureSpec2, iHn);
                        int measuredWidth4 = viewHn.getMeasuredWidth();
                        int measuredHeight4 = viewHn.getMeasuredHeight();
                        hnj(i17, iMakeMeasureSpec2, iHn, viewHn);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + hnVar.mjg() + hnVar.jip() + this.gjv.hnj(viewHn));
                    qorVar.f12409sk += measuredWidth3 + hnVar.orl() + hnVar.fc();
                    iMax = iMax2;
                }
                qorVar.dse = Math.max(qorVar.dse, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == qorVar.f12409sk) {
            return;
        }
        hnj(i10, i11, qorVar, i12, i13, true);
    }

    private int hnj(int i10, com.bytedance.adsdk.ugeno.sk.hn hnVar, int i11) {
        com.bytedance.adsdk.ugeno.sk.hnj hnjVar = this.gjv;
        int iHnj = hnjVar.hnj(i10, hnjVar.getPaddingLeft() + this.gjv.getPaddingRight() + hnVar.orl() + hnVar.fc() + i11, hnVar.hnj());
        int size = View.MeasureSpec.getSize(iHnj);
        if (size > hnVar.ojm()) {
            return View.MeasureSpec.makeMeasureSpec(hnVar.ojm(), View.MeasureSpec.getMode(iHnj));
        }
        return size < hnVar.dse() ? View.MeasureSpec.makeMeasureSpec(hnVar.dse(), View.MeasureSpec.getMode(iHnj)) : iHnj;
    }

    private List<qor> hnj(List<qor> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        qor qorVar = new qor();
        qorVar.dse = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(qorVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(qorVar);
            }
        }
        return arrayList;
    }

    void hnj() {
        hnj(0);
    }

    void hnj(int i10) {
        View viewHn;
        if (i10 >= this.gjv.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.gjv.getFlexDirection();
        if (this.gjv.getAlignItems() == 4) {
            int[] iArr = this.hnj;
            List<qor> flexLinesInternal = this.gjv.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                qor qorVar = flexLinesInternal.get(i11);
                int i12 = qorVar.aq;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = qorVar.f12406fc + i13;
                    if (i13 < this.gjv.getFlexItemCount() && (viewHn = this.gjv.hn(i14)) != null && viewHn.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) viewHn.getLayoutParams();
                        if (hnVar.dkl() == -1 || hnVar.dkl() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                hn(viewHn, qorVar.dse, i14);
                            } else {
                                hnj(viewHn, qorVar.dse, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (qor qorVar2 : this.gjv.getFlexLinesInternal()) {
            for (Integer num : qorVar2.mjg) {
                View viewHn2 = this.gjv.hn(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    hn(viewHn2, qorVar2.dse, num.intValue());
                } else {
                    hnj(viewHn2, qorVar2.dse, num.intValue());
                }
            }
        }
    }

    private void hnj(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - hnVar.mjg()) - hnVar.jip()) - this.gjv.hnj(view), hnVar.aq()), hnVar.ta());
        long[] jArr = this.dkl;
        if (jArr != null) {
            measuredWidth = hnj(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        hnj(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    void hnj(View view, qor qorVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) view.getLayoutParams();
        int alignItems = this.gjv.getAlignItems();
        if (hnVar.dkl() != -1) {
            alignItems = hnVar.dkl();
        }
        int i14 = qorVar.dse;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.gjv.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - hnVar.jip(), i12, i15 - hnVar.jip());
                    return;
                } else {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + hnVar.mjg(), i12, (i13 - i14) + view.getMeasuredHeight() + hnVar.mjg());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + hnVar.mjg()) - hnVar.jip()) / 2;
                if (this.gjv.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.gjv.getFlexWrap() != 2) {
                    int iMax = Math.max(qorVar.bug - view.getBaseline(), hnVar.mjg());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((qorVar.bug - view.getMeasuredHeight()) + view.getBaseline(), hnVar.jip());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.gjv.getFlexWrap() != 2) {
            view.layout(i10, i11 + hnVar.mjg(), i12, i13 + hnVar.mjg());
        } else {
            view.layout(i10, i11 - hnVar.jip(), i12, i13 - hnVar.jip());
        }
    }

    void hnj(View view, qor qorVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.sk.hn hnVar = (com.bytedance.adsdk.ugeno.sk.hn) view.getLayoutParams();
        int alignItems = this.gjv.getAlignItems();
        if (hnVar.dkl() != -1) {
            alignItems = hnVar.dkl();
        }
        int i14 = qorVar.dse;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - hnVar.fc(), i11, ((i12 + i14) - view.getMeasuredWidth()) - hnVar.fc(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + hnVar.orl(), i11, (i12 - i14) + view.getMeasuredWidth() + hnVar.orl(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.dse.dkl.hnj(marginLayoutParams)) - com.bytedance.adsdk.ugeno.dse.dkl.hn(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + hnVar.orl(), i11, i12 + hnVar.orl(), i13);
        } else {
            view.layout(i10 - hnVar.fc(), i11, i12 - hnVar.fc(), i13);
        }
    }

    private void hnj(int i10, int i11, int i12, View view) {
        long[] jArr = this.f12402hn;
        if (jArr != null) {
            jArr[i10] = hn(i11, i12);
        }
        long[] jArr2 = this.dkl;
        if (jArr2 != null) {
            jArr2[i10] = hn(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
