package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f25374a;

    public O(U u10) {
        this.f25374a = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fHeight;
        ArrayList arrayList;
        I6 i10;
        M mA = U.a(this.f25374a);
        U u10 = this.f25374a;
        u10.getClass();
        if (mA == null) {
            i10 = new I6(0.0f, null, null);
        } else {
            RectF rectF = mA.f25234a;
            if (rectF.isEmpty()) {
                i10 = new I6(0.0f, null, null);
            } else {
                float measuredHeight = u10.f25778a.getMeasuredHeight() * u10.f25778a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    i10 = new I6(0.0f, null, null);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int[] iArr = new int[2];
                    u10.f25778a.getLocationInWindow(iArr);
                    fl.q qVar = new fl.q(Float.valueOf(iArr[0]), Float.valueOf(iArr[1]));
                    float fFloatValue = ((Number) qVar.d()).floatValue();
                    float fFloatValue2 = ((Number) qVar.g()).floatValue();
                    ArrayList arrayList3 = mA.f25235b;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        RectF rectF2 = (RectF) obj;
                        arrayList2.add(new RectF(rectF2.left - fFloatValue, rectF2.top - fFloatValue2, rectF2.right - fFloatValue, rectF2.bottom - fFloatValue2));
                    }
                    ArrayList arrayList4 = mA.f25235b;
                    if (arrayList4.isEmpty()) {
                        fHeight = 0.0f;
                    } else {
                        int size2 = arrayList4.size();
                        fHeight = 0.0f;
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList4.get(i12);
                            i12++;
                            RectF rectF3 = (RectF) obj2;
                            fHeight += rectF3.height() * rectF3.width();
                        }
                    }
                    float fMin = Math.min(fHeight, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float fWidth = rectF4.width();
                    float fHeight2 = rectF4.height();
                    float fA = J3.a(Math.min((Math.max(0.0f, ((fWidth <= 0.0f || fHeight2 <= 0.0f) ? 0.0f : Math.max(0.0f, fWidth * fHeight2)) - fMin) / measuredHeight) * 100.0f, 100.0f));
                    J6 j10 = new J6(Math.max(0.0f, J3.a(rectF.left / N5.b())), Math.max(0.0f, J3.a(rectF.top / N5.b())), Math.max(0, J3.b(rectF.width() / N5.b())), Math.max(0, J3.b(rectF.height() / N5.b())));
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList5 = new ArrayList(gl.r.v(arrayList2, 10));
                        int size3 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj3 = arrayList2.get(i13);
                            i13++;
                            RectF rectF5 = (RectF) obj3;
                            arrayList5.add(new J6(Math.max(0.0f, J3.a(rectF5.left / N5.b())), Math.max(0.0f, J3.a(rectF5.top / N5.b())), Math.max(0, J3.b(rectF5.width() / N5.b())), Math.max(0, J3.b(J3.b(rectF5.height()) / N5.b()))));
                        }
                        arrayList = new ArrayList(gl.r.z0(arrayList5, new P()));
                    }
                    i10 = new I6(fA, j10, arrayList);
                }
            }
        }
        U u11 = this.f25374a;
        if (kotlin.jvm.internal.s.c(i10, u11.f25785h)) {
            return;
        }
        ((C2892ci) u11.f25781d).a(i10);
        u11.f25785h = i10;
    }
}
