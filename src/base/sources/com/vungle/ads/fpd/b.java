package com.vungle.ads.fpd;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import pm.k;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b \u0010\u0003R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b!\u0010\u0003¨\u0006%"}, d2 = {"Lcom/vungle/ads/fpd/b;", "", "<init>", "()V", "", "seen1", "ageRange", "gender", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/fpd/b;Lsm/d;Lrm/f;)V", "Lcom/vungle/ads/fpd/d;", "setGender", "(Lcom/vungle/ads/fpd/d;)Lcom/vungle/ads/fpd/b;", "age", "setAgeRange", "(I)Lcom/vungle/ads/fpd/b;", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "Ljava/lang/Integer;", "getAgeRange$annotations", "getGender$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@k
public final class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer ageRange;
    private Integer gender;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.fpd.Demographic", aVar, 2);
            g2Var.p("age_range", true);
            g2Var.p("gender", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            u0 u0Var = u0.f53588a;
            return new pm.d[]{qm.a.t(u0Var), qm.a.t(u0Var)};
        }

        @Override // pm.c
        public b deserialize(sm.e decoder) {
            Object objE;
            int i10;
            Object objE2;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            q2 q2Var = null;
            if (cVarB.l()) {
                u0 u0Var = u0.f53588a;
                objE2 = cVarB.e(descriptor2, 0, u0Var, null);
                objE = cVarB.e(descriptor2, 1, u0Var, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                objE = null;
                Object objE3 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objE3 = cVarB.e(descriptor2, 0, u0.f53588a, objE3);
                        i11 |= 1;
                    } else {
                        if (iO != 1) {
                            throw new UnknownFieldException(iO);
                        }
                        objE = cVarB.e(descriptor2, 1, u0.f53588a, objE);
                        i11 |= 2;
                    }
                }
                i10 = i11;
                objE2 = objE3;
            }
            cVarB.d(descriptor2);
            return new b(i10, (Integer) objE2, (Integer) objE, q2Var);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, b value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            b.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.fpd.b$b, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pm.d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    public b() {
    }

    public static final void write$Self(b self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.ageRange != null) {
            output.w(serialDesc, 0, u0.f53588a, self.ageRange);
        }
        if (!output.k(serialDesc, 1) && self.gender == null) {
            return;
        }
        output.w(serialDesc, 1, u0.f53588a, self.gender);
    }

    public final b setAgeRange(int age) {
        this.ageRange = Integer.valueOf(com.vungle.ads.fpd.a.Companion.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    public final b setGender(d gender) {
        s.h(gender, "gender");
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }

    public /* synthetic */ b(int i10, Integer num, Integer num2, q2 q2Var) {
        if ((i10 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i10 & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getGender$annotations() {
    }

    public final b setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    public final b setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    public final b setMonthlyHousingCosts(int housingCost) {
        return this;
    }
}
