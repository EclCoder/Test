package com.vungle.ads.internal.signals;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.model.UnclosedAd;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import pm.d;
import pm.k;
import rm.f;
import sm.e;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;

/* JADX INFO: renamed from: com.vungle.ads.internal.signals.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XYB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B¥\u0001\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0004\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010$R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010(R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00105\u0012\u0004\b:\u00101\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010;\u0012\u0004\b@\u00101\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u00105\u0012\u0004\bC\u00101\u001a\u0004\bA\u00107\"\u0004\bB\u00109R(\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010.\u0012\u0004\bF\u00101\u001a\u0004\bD\u0010$\"\u0004\bE\u0010\u0005R.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010;\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010.\u0012\u0004\bK\u00101\u001a\u0004\b\u0013\u0010$\"\u0004\bJ\u0010\u0005R(\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010.\u0012\u0004\bM\u00101\u001a\u0004\b\u0014\u0010$\"\u0004\bL\u0010\u0005R(\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010.\u0012\u0004\bP\u00101\u001a\u0004\bN\u0010$\"\u0004\bO\u0010\u0005R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010.\u0012\u0004\bS\u00101\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010\u0005R(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010.\u0012\u0004\bV\u00101\u001a\u0004\bT\u0010$\"\u0004\bU\u0010\u0005¨\u0006Z"}, d2 = {"Lcom/vungle/ads/internal/signals/a;", "", "", "sessionCount", "<init>", "(I)V", "seen1", "", "sessionId", "", "sessionCreationTime", "", "Lcom/vungle/ads/internal/signals/c;", "signaledAd", "sessionDuration", "sessionDepthCounter", "", "Lcom/vungle/ads/internal/model/n;", "unclosedAd", "isDevice", "isVPNConnected", "overlayGranted", "sensorCount", "httpProxyEnabled", "Ltm/q2;", "serializationConstructorMarker", "(IILjava/lang/String;JLjava/util/List;JILjava/util/List;IIIIILtm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/signals/a;Lsm/d;Lrm/f;)V", "component1", "()I", "copy", "(I)Lcom/vungle/ads/internal/signals/a;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSessionCount", "getSessionCount$annotations", "()V", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "J", "getSessionCreationTime", "()J", "setSessionCreationTime", "(J)V", "getSessionCreationTime$annotations", "Ljava/util/List;", "getSignaledAd", "()Ljava/util/List;", "setSignaledAd", "(Ljava/util/List;)V", "getSignaledAd$annotations", "getSessionDuration", "setSessionDuration", "getSessionDuration$annotations", "getSessionDepthCounter", "setSessionDepthCounter", "getSessionDepthCounter$annotations", "getUnclosedAd", "setUnclosedAd", "getUnclosedAd$annotations", "setDevice", "isDevice$annotations", "setVPNConnected", "isVPNConnected$annotations", "getOverlayGranted", "setOverlayGranted", "getOverlayGranted$annotations", "getSensorCount", "setSensorCount", "getSensorCount$annotations", "getHttpProxyEnabled", "setHttpProxyEnabled", "getHttpProxyEnabled$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@k
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<SignaledAd> signaledAd;
    private List<UnclosedAd> unclosedAd;

    /* JADX INFO: renamed from: com.vungle.ads.internal.signals.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0530a implements l0 {
        public static final C0530a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            C0530a c0530a = new C0530a();
            INSTANCE = c0530a;
            g2 g2Var = new g2("com.vungle.ads.internal.signals.SessionData", c0530a, 12);
            g2Var.p("103", false);
            g2Var.p(StatisticData.ERROR_CODE_IO_ERROR, true);
            g2Var.p(StatisticData.ERROR_CODE_NOT_FOUND, true);
            g2Var.p("106", true);
            g2Var.p("102", true);
            g2Var.p("104", true);
            g2Var.p("105", true);
            g2Var.p("112", true);
            g2Var.p("113", true);
            g2Var.p("114", true);
            g2Var.p("115", true);
            g2Var.p("116", true);
            descriptor = g2Var;
        }

        private C0530a() {
        }

        @Override // tm.l0
        public d[] childSerializers() {
            tm.f fVar = new tm.f(SignaledAd.a.INSTANCE);
            tm.f fVar2 = new tm.f(UnclosedAd.a.INSTANCE);
            u0 u0Var = u0.f53588a;
            f1 f1Var = f1.f53474a;
            return new d[]{u0Var, v2.f53598a, f1Var, fVar, f1Var, u0Var, fVar2, u0Var, u0Var, u0Var, u0Var, u0Var};
        }

        @Override // pm.c
        public SessionData deserialize(e decoder) {
            int i10;
            Object objN;
            Object objN2;
            int iS;
            int i11;
            int i12;
            int i13;
            int i14;
            int iS2;
            long j10;
            String str;
            long j11;
            s.h(decoder, "decoder");
            f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            int i15 = 0;
            if (cVarB.l()) {
                int iS3 = cVarB.s(descriptor2, 0);
                String strH = cVarB.H(descriptor2, 1);
                long jZ = cVarB.z(descriptor2, 2);
                objN2 = cVarB.n(descriptor2, 3, new tm.f(SignaledAd.a.INSTANCE), null);
                long jZ2 = cVarB.z(descriptor2, 4);
                int iS4 = cVarB.s(descriptor2, 5);
                objN = cVarB.n(descriptor2, 6, new tm.f(UnclosedAd.a.INSTANCE), null);
                int iS5 = cVarB.s(descriptor2, 7);
                int iS6 = cVarB.s(descriptor2, 8);
                int iS7 = cVarB.s(descriptor2, 9);
                i15 = 4095;
                i10 = iS3;
                iS = cVarB.s(descriptor2, 10);
                i11 = iS7;
                i12 = iS5;
                i13 = iS6;
                i14 = iS4;
                iS2 = cVarB.s(descriptor2, 11);
                j10 = jZ2;
                str = strH;
                j11 = jZ;
            } else {
                int i16 = 11;
                boolean z10 = true;
                int iS8 = 0;
                int iS9 = 0;
                int iS10 = 0;
                int iS11 = 0;
                Object objN3 = null;
                Object objN4 = null;
                String strH2 = null;
                long jZ3 = 0;
                long jZ4 = 0;
                int iS12 = 0;
                int iS13 = 0;
                int iS14 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            i16 = 11;
                            break;
                        case 0:
                            i15 |= 1;
                            iS8 = cVarB.s(descriptor2, 0);
                            i16 = 11;
                            break;
                        case 1:
                            strH2 = cVarB.H(descriptor2, 1);
                            i15 |= 2;
                            i16 = 11;
                            break;
                        case 2:
                            jZ4 = cVarB.z(descriptor2, 2);
                            i15 |= 4;
                            i16 = 11;
                            break;
                        case 3:
                            objN4 = cVarB.n(descriptor2, 3, new tm.f(SignaledAd.a.INSTANCE), objN4);
                            i15 |= 8;
                            i16 = 11;
                            break;
                        case 4:
                            jZ3 = cVarB.z(descriptor2, 4);
                            i15 |= 16;
                            i16 = 11;
                            break;
                        case 5:
                            iS10 = cVarB.s(descriptor2, 5);
                            i15 |= 32;
                            i16 = 11;
                            break;
                        case 6:
                            objN3 = cVarB.n(descriptor2, 6, new tm.f(UnclosedAd.a.INSTANCE), objN3);
                            i15 |= 64;
                            i16 = 11;
                            break;
                        case 7:
                            iS14 = cVarB.s(descriptor2, 7);
                            i15 |= 128;
                            break;
                        case 8:
                            iS9 = cVarB.s(descriptor2, 8);
                            i15 |= 256;
                            break;
                        case 9:
                            iS13 = cVarB.s(descriptor2, 9);
                            i15 |= 512;
                            break;
                        case 10:
                            iS12 = cVarB.s(descriptor2, 10);
                            i15 |= UserVerificationMethods.USER_VERIFY_ALL;
                            break;
                        case 11:
                            iS11 = cVarB.s(descriptor2, i16);
                            i15 |= 2048;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = iS8;
                objN = objN3;
                objN2 = objN4;
                iS = iS12;
                i11 = iS13;
                i12 = iS14;
                i13 = iS9;
                i14 = iS10;
                iS2 = iS11;
                j10 = jZ3;
                str = strH2;
                j11 = jZ4;
            }
            int i17 = i15;
            cVarB.d(descriptor2);
            return new SessionData(i17, i10, str, j11, (List) objN2, j10, i14, (List) objN, i12, i13, i11, iS, iS2, null);
        }

        @Override // pm.d, pm.l, pm.c
        public f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, SessionData value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            SessionData.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.signals.a$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d serializer() {
            return C0530a.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionData(int i10) {
        this.sessionCount = i10;
        String string = UUID.randomUUID().toString();
        s.g(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sessionData.sessionCount;
        }
        return sessionData.copy(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public static final void write$Self(SessionData self, sm.d output, f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        output.i(serialDesc, 0, self.sessionCount);
        if (output.k(serialDesc, 1)) {
            output.F(serialDesc, 1, self.sessionId);
        } else {
            String str = self.sessionId;
            String string = UUID.randomUUID().toString();
            s.g(string, "randomUUID().toString()");
            if (!s.c(str, string)) {
                output.F(serialDesc, 1, self.sessionId);
            }
        }
        if (output.k(serialDesc, 2) || self.sessionCreationTime != System.currentTimeMillis() / 1000) {
            output.e(serialDesc, 2, self.sessionCreationTime);
        }
        if (output.k(serialDesc, 3) || !s.c(self.signaledAd, new ArrayList())) {
            output.A(serialDesc, 3, new tm.f(SignaledAd.a.INSTANCE), self.signaledAd);
        }
        if (output.k(serialDesc, 4) || self.sessionDuration != 0) {
            output.e(serialDesc, 4, self.sessionDuration);
        }
        if (output.k(serialDesc, 5) || self.sessionDepthCounter != 0) {
            output.i(serialDesc, 5, self.sessionDepthCounter);
        }
        if (output.k(serialDesc, 6) || !s.c(self.unclosedAd, new ArrayList())) {
            output.A(serialDesc, 6, new tm.f(UnclosedAd.a.INSTANCE), self.unclosedAd);
        }
        if (output.k(serialDesc, 7) || self.isDevice != 0) {
            output.i(serialDesc, 7, self.isDevice);
        }
        if (output.k(serialDesc, 8) || self.isVPNConnected != 0) {
            output.i(serialDesc, 8, self.isVPNConnected);
        }
        if (output.k(serialDesc, 9) || self.overlayGranted != 0) {
            output.i(serialDesc, 9, self.overlayGranted);
        }
        if (output.k(serialDesc, 10) || self.sensorCount != 0) {
            output.i(serialDesc, 10, self.sensorCount);
        }
        if (!output.k(serialDesc, 11) && self.httpProxyEnabled == 0) {
            return;
        }
        output.i(serialDesc, 11, self.httpProxyEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final SessionData copy(int sessionCount) {
        return new SessionData(sessionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionData) && this.sessionCount == ((SessionData) other).sessionCount;
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    /* JADX INFO: renamed from: isDevice, reason: from getter */
    public final int getIsDevice() {
        return this.isDevice;
    }

    /* JADX INFO: renamed from: isVPNConnected, reason: from getter */
    public final int getIsVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i10) {
        this.isDevice = i10;
    }

    public final void setHttpProxyEnabled(int i10) {
        this.httpProxyEnabled = i10;
    }

    public final void setOverlayGranted(int i10) {
        this.overlayGranted = i10;
    }

    public final void setSensorCount(int i10) {
        this.sensorCount = i10;
    }

    public final void setSessionCreationTime(long j10) {
        this.sessionCreationTime = j10;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSignaledAd(List<SignaledAd> list) {
        s.h(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<UnclosedAd> list) {
        s.h(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i10) {
        this.isVPNConnected = i10;
    }

    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    public /* synthetic */ SessionData(int i10, int i11, String str, long j10, List list, long j11, int i12, List list2, int i13, int i14, int i15, int i16, int i17, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, C0530a.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            String string = UUID.randomUUID().toString();
            s.g(string, "randomUUID().toString()");
            this.sessionId = string;
        } else {
            this.sessionId = str;
        }
        if ((i10 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j10;
        }
        if ((i10 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i10 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j11;
        }
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        if ((i10 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
        if ((i10 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i13;
        }
        if ((i10 & 256) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i14;
        }
        if ((i10 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i15;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i16;
        }
        if ((i10 & 2048) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i17;
        }
    }

    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    public static /* synthetic */ void getSensorCount$annotations() {
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    public static /* synthetic */ void isDevice$annotations() {
    }

    public static /* synthetic */ void isVPNConnected$annotations() {
    }
}
