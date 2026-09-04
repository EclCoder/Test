package com.vungle.ads.internal.model;

import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fl.g0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.v;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;

/* JADX INFO: renamed from: com.vungle.ads.internal.model.e, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBI\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J:\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010'R\u001a\u00108\u001a\u0002078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010;R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<¨\u0006@"}, d2 = {"Lcom/vungle/ads/internal/model/e;", "", "", "version", "", "adunit", "", "impression", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lcom/vungle/ads/internal/model/b;", "ad", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/vungle/ads/internal/model/b;Ltm/q2;)V", "", "compressed", "gzipDecode", "([B)Ljava/lang/String;", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/e;Lsm/d;Lrm/f;)V", "getPlacementId", "()Ljava/lang/String;", "getEventId", "getCreativeId", "getAdPayload", "()Lcom/vungle/ads/internal/model/b;", "getDecodedAdsResponse", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/vungle/ads/internal/model/e;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/String;", "getAdunit", "Ljava/util/List;", "getImpression", "Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/b;", "getJson$annotations", "()V", "Lcom/vungle/ads/internal/model/b;", "Companion", "a", "c", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class BidPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final com.vungle.ads.internal.model.b ad;
    private final String adunit;
    private final List<String> impression;
    private final kotlinx.serialization.json.b json;
    private final Integer version;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.e$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.BidPayload", aVar, 4);
            g2Var.p("version", true);
            g2Var.p("adunit", true);
            g2Var.p("impression", true);
            g2Var.p("ad", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            pm.d dVarT = qm.a.t(u0.f53588a);
            v2 v2Var = v2.f53598a;
            return new pm.d[]{dVarT, qm.a.t(v2Var), qm.a.t(new tm.f(v2Var)), qm.a.t(com.vungle.ads.internal.model.b.a.INSTANCE)};
        }

        @Override // pm.c
        public BidPayload deserialize(sm.e decoder) {
            int i10;
            Object objE;
            Object objE2;
            Object objE3;
            Object objE4;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            Object objE5 = null;
            if (cVarB.l()) {
                objE = cVarB.e(descriptor2, 0, u0.f53588a, null);
                v2 v2Var = v2.f53598a;
                objE2 = cVarB.e(descriptor2, 1, v2Var, null);
                objE3 = cVarB.e(descriptor2, 2, new tm.f(v2Var), null);
                objE4 = cVarB.e(descriptor2, 3, com.vungle.ads.internal.model.b.a.INSTANCE, null);
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Object objE6 = null;
                Object objE7 = null;
                Object objE8 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objE5 = cVarB.e(descriptor2, 0, u0.f53588a, objE5);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objE6 = cVarB.e(descriptor2, 1, v2.f53598a, objE6);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objE7 = cVarB.e(descriptor2, 2, new tm.f(v2.f53598a), objE7);
                        i11 |= 4;
                    } else {
                        if (iO != 3) {
                            throw new UnknownFieldException(iO);
                        }
                        objE8 = cVarB.e(descriptor2, 3, com.vungle.ads.internal.model.b.a.INSTANCE, objE8);
                        i11 |= 8;
                    }
                }
                Object obj = objE5;
                i10 = i11;
                objE = obj;
                objE2 = objE6;
                objE3 = objE7;
                objE4 = objE8;
            }
            cVarB.d(descriptor2);
            return new BidPayload(i10, (Integer) objE, (String) objE2, (List) objE3, (com.vungle.ads.internal.model.b) objE4, null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, BidPayload value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            BidPayload.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.e$b */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements Function1 {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kotlinx.serialization.json.e) obj);
            return g0.f38750a;
        }

        public final void invoke(kotlinx.serialization.json.e Json) {
            s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.e$c, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.e$d */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends t implements Function1 {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kotlinx.serialization.json.e) obj);
            return g0.f38750a;
        }

        public final void invoke(kotlinx.serialization.json.e Json) {
            s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private final String gzipDecode(byte[] compressed) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, UserVerificationMethods.USER_VERIFY_ALL);
            try {
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr);
                    if (i10 == -1) {
                        g0 g0Var = g0.f38750a;
                        ql.b.a(gZIPInputStream, null);
                        ql.b.a(byteArrayInputStream, null);
                        String string = byteArrayOutputStream.toString();
                        s.g(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ql.b.a(byteArrayInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ql.b.a(gZIPInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public static final void write$Self(BidPayload self, sm.d output, rm.f serialDesc) {
        String decodedAdsResponse;
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.version != null) {
            output.w(serialDesc, 0, u0.f53588a, self.version);
        }
        if (output.k(serialDesc, 1) || self.adunit != null) {
            output.w(serialDesc, 1, v2.f53598a, self.adunit);
        }
        if (output.k(serialDesc, 2) || self.impression != null) {
            output.w(serialDesc, 2, new tm.f(v2.f53598a), self.impression);
        }
        if (!output.k(serialDesc, 3)) {
            com.vungle.ads.internal.model.b bVar = self.ad;
            com.vungle.ads.internal.model.b bVar2 = null;
            if (self.adunit != null && (decodedAdsResponse = self.getDecodedAdsResponse()) != null) {
                kotlinx.serialization.json.b bVar3 = self.json;
                pm.d dVarB = pm.t.b(bVar3.a(), kotlin.jvm.internal.l0.k(com.vungle.ads.internal.model.b.class));
                s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                bVar2 = (com.vungle.ads.internal.model.b) bVar3.b(dVarB, decodedAdsResponse);
            }
            if (s.c(bVar, bVar2)) {
                return;
            }
        }
        output.w(serialDesc, 3, com.vungle.ads.internal.model.b.a.INSTANCE, self.ad);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdunit() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final BidPayload copy(Integer version, String adunit, List<String> impression) {
        return new BidPayload(version, adunit, impression);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) other;
        return s.c(this.version, bidPayload.version) && s.c(this.adunit, bidPayload.adunit) && s.c(this.impression, bidPayload.impression);
    }

    /* JADX INFO: renamed from: getAdPayload, reason: from getter */
    public final com.vungle.ads.internal.model.b getAd() {
        return this.ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getCreativeId() {
        com.vungle.ads.internal.model.b bVar = this.ad;
        if (bVar != null) {
            return bVar.getCreativeId();
        }
        return null;
    }

    public final String getDecodedAdsResponse() {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    public final String getEventId() {
        com.vungle.ads.internal.model.b bVar = this.ad;
        if (bVar != null) {
            return bVar.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        com.vungle.ads.internal.model.b bVar = this.ad;
        if (bVar != null) {
            return bVar.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, com.vungle.ads.internal.model.b bVar, q2 q2Var) {
        String decodedAdsResponse;
        com.vungle.ads.internal.model.b bVar2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        kotlinx.serialization.json.b bVarB = v.b(null, b.INSTANCE, 1, null);
        this.json = bVarB;
        if ((i10 & 8) != 0) {
            this.ad = bVar;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            pm.d dVarB = pm.t.b(bVarB.a(), kotlin.jvm.internal.l0.k(com.vungle.ads.internal.model.b.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            bVar2 = (com.vungle.ads.internal.model.b) bVarB.b(dVarB, decodedAdsResponse);
        }
        this.ad = bVar2;
    }

    public BidPayload(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        com.vungle.ads.internal.model.b bVar = null;
        kotlinx.serialization.json.b bVarB = v.b(null, d.INSTANCE, 1, null);
        this.json = bVarB;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            pm.d dVarB = pm.t.b(bVarB.a(), kotlin.jvm.internal.l0.k(com.vungle.ads.internal.model.b.class));
            s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            bVar = (com.vungle.ads.internal.model.b) bVarB.b(dVarB, decodedAdsResponse);
        }
        this.ad = bVar;
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
