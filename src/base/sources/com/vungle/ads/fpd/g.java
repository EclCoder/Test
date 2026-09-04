package com.vungle.ads.fpd;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.util.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import pm.k;
import tm.g2;
import tm.k0;
import tm.l0;
import tm.q2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0013\b\u0007\u0018\u0000 22\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\u0018J\u001f\u0010$\u001a\u00020\u00002\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\u0014J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010\u0014J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\u001bJ\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0007\u00100\u0012\u0004\b1\u0010\u0003¨\u00065"}, d2 = {"Lcom/vungle/ads/fpd/g;", "", "<init>", "()V", "", "seen1", "", "levelPercentile", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Float;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/fpd/g;Lsm/d;Lrm/f;)V", "setLevelPercentile", "(F)Lcom/vungle/ads/fpd/g;", "", "page", "setPage", "(Ljava/lang/String;)Lcom/vungle/ads/fpd/g;", "timeSpent", "setTimeSpent", "(I)Lcom/vungle/ads/fpd/g;", "signupDate", "setSignupDate", "userScorePercentile", "setUserScorePercentile", "userID", "setUserID", "", "friends", "setFriends", "(Ljava/util/List;)Lcom/vungle/ads/fpd/g;", "userLevelPercentile", "setUserLevelPercentile", "healthPercentile", "setHealthPercentile", "sessionStartTime", "setSessionStartTime", "sessionDuration", "setSessionDuration", "inGamePurchasesUSD", "setInGamePurchasesUSD", "Ljava/lang/Float;", "getLevelPercentile$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@k
public final class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float levelPercentile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.fpd.SessionContext", aVar, 1);
            g2Var.p("level_percentile", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            return new pm.d[]{qm.a.t(k0.f53526a)};
        }

        @Override // pm.c
        public g deserialize(sm.e decoder) {
            Object objE;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            int i10 = 1;
            q2 q2Var = null;
            if (cVarB.l()) {
                objE = cVarB.e(descriptor2, 0, k0.f53526a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                objE = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else {
                        if (iO != 0) {
                            throw new UnknownFieldException(iO);
                        }
                        objE = cVarB.e(descriptor2, 0, k0.f53526a, objE);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.d(descriptor2);
            return new g(i10, (Float) objE, q2Var);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, g value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            g.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.fpd.g$b, reason: from kotlin metadata */
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

    public g() {
    }

    public static final void write$Self(g self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (!output.k(serialDesc, 0) && self.levelPercentile == null) {
            return;
        }
        output.w(serialDesc, 0, k0.f53526a, self.levelPercentile);
    }

    public final g setLevelPercentile(float levelPercentile) {
        if (t.INSTANCE.isInRange(levelPercentile, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(levelPercentile);
        }
        return this;
    }

    public final g setPage(String page) {
        s.h(page, "page");
        return this;
    }

    public final g setUserID(String userID) {
        s.h(userID, "userID");
        return this;
    }

    public /* synthetic */ g(int i10, Float f10, q2 q2Var) {
        if ((i10 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
    }

    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    public final g setFriends(List<String> friends) {
        return this;
    }

    public final g setHealthPercentile(float healthPercentile) {
        return this;
    }

    public final g setInGamePurchasesUSD(float inGamePurchasesUSD) {
        return this;
    }

    public final g setSessionDuration(int sessionDuration) {
        return this;
    }

    public final g setSessionStartTime(int sessionStartTime) {
        return this;
    }

    public final g setSignupDate(int signupDate) {
        return this;
    }

    public final g setTimeSpent(int timeSpent) {
        return this;
    }

    public final g setUserLevelPercentile(float userLevelPercentile) {
        return this;
    }

    public final g setUserScorePercentile(float userScorePercentile) {
        return this;
    }
}
