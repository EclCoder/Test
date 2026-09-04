package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.inmobi.media.AbstractC2829a7;
import com.inmobi.media.AbstractC2891ch;
import com.inmobi.media.AbstractC2971fk;
import com.inmobi.media.B5;
import com.inmobi.media.B8;
import com.inmobi.media.C3231pl;
import com.inmobi.media.E1;
import com.inmobi.media.F9;
import com.inmobi.media.G9;
import com.inmobi.media.H9;
import com.inmobi.media.Ka;
import com.inmobi.media.Kk;
import com.inmobi.media.La;
import com.inmobi.media.M2;
import com.inmobi.media.Qk;
import com.inmobi.media.Sb;
import com.inmobi.media.Sf;
import com.inmobi.media.Ug;
import com.inmobi.media.W9;
import com.inmobi.media.Wi;
import com.inmobi.media.Xg;
import com.inmobi.media.Xi;
import com.inmobi.media.Yg;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import fl.g0;
import fl.k;
import fl.q;
import fl.w;
import gl.l0;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import ml.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005MNOPQJ9\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010&J-\u0010,\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001aH\u0007¢\u0006\u0004\b/\u0010\u001dJ\u0017\u00102\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b9\u0010&J\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b;\u0010&J\u0019\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010\u0015J1\u0010@\u001a\u0004\u0018\u00010\u00042\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010A2\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010DJ\u0019\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bF\u0010\u000eJ\u000f\u0010G\u001a\u00020\u0010H\u0007¢\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bL\u0010J¨\u0006R"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk;", "", "Landroid/content/Context;", "context", "", "accountId", "Lorg/json/JSONObject;", "consentObject", "Lcom/inmobi/sdk/SdkInitializationListener;", "sdkInitializationListener", "Lfl/g0;", "init", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lcom/inmobi/sdk/SdkInitializationListener;)V", "updateGDPRConsent", "(Lorg/json/JSONObject;)V", "setPartnerGDPRConsent", "", "muted", "setApplicationMuted", "(Z)V", "getVersion", "()Ljava/lang/String;", "Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "logLevel", "setLogLevel", "(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V", "", "age", "setAge", "(I)V", "isAgeRestricted", "setIsAgeRestricted", "Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "group", "setAgeGroup", "(Lcom/inmobi/sdk/InMobiSdk$AgeGroup;)V", "areaCode", "setAreaCode", "(Ljava/lang/String;)V", "postalCode", "setPostalCode", "city", "state", "country", "setLocationWithCityStateCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "yearOfBirth", "setYearOfBirth", "Lcom/inmobi/sdk/InMobiSdk$Gender;", "gender", "setGender", "(Lcom/inmobi/sdk/InMobiSdk$Gender;)V", "Lcom/inmobi/sdk/InMobiSdk$Education;", "education", "setEducation", "(Lcom/inmobi/sdk/InMobiSdk$Education;)V", "language", "setLanguage", "interests", "setInterests", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)V", "getToken", "", "extras", "keywords", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "setPublisherProvidedUnifiedId", "isSDKInitialized", "()Z", "IM_GDPR_CONSENT_AVAILABLE", "Ljava/lang/String;", "IM_GDPR_CONSENT_IAB", "IM_GDPR_CONSENT_GDPR_APPLIES", "LogLevel", "Education", "PublisherSignals", "Gender", "AgeGroup", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BELOW_18", "BETWEEN_18_AND_24", "BETWEEN_25_AND_29", "BETWEEN_30_AND_34", "BETWEEN_35_AND_44", "BETWEEN_45_AND_54", "BETWEEN_55_AND_65", "ABOVE_65", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");

        private static final /* synthetic */ ml.a $ENTRIES = b.a(values());
        private final String value;

        AgeGroup(String str) {
            this.value = str;
        }

        public static ml.a getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Education;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HIGH_SCHOOL_OR_LESS", "COLLEGE_OR_GRADUATE", "POST_GRADUATE_OR_ABOVE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");

        private static final /* synthetic */ ml.a $ENTRIES = b.a(values());
        private final String value;

        Education(String str) {
            this.value = str;
        }

        public static ml.a getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Gender;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FEMALE", "MALE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Gender {
        FEMALE("f"),
        MALE("m");

        private static final /* synthetic */ ml.a $ENTRIES = b.a(values());
        private final String value;

        Gender(String str) {
            this.value = str;
        }

        public static ml.a getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ERROR", "DEBUG", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG;

        private static final /* synthetic */ ml.a $ENTRIES = b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$PublisherSignals;", "", "", "", "signals", "Lfl/g0;", "putPublisherSignals", "(Ljava/util/Map;)V", "getPublisherSignals", "()Ljava/util/Map;", "resetPublisherSignals", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherSignals {
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        public final Map<String, Object> getPublisherSignals() {
            Map mapH;
            Map mapV;
            Iterator it;
            ArrayList arrayList;
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                s.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                Sb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            Xg xg2 = Xg.f26013a;
            xg2.getClass();
            try {
                SignalsConfig.PublisherConfig publisherConfigC = Xg.c();
                Map map = Yg.f26086a;
                s.h(publisherConfigC, "<this>");
                if (!publisherConfigC.getEnableMCO() && !publisherConfigC.getEnableAB()) {
                    return l0.h();
                }
                try {
                    SignalsConfig.PublisherConfig publisherConfigC2 = Xg.c();
                    s.h(publisherConfigC2, "<this>");
                    mapH = (publisherConfigC2.getEnableMCO() || publisherConfigC2.getEnableAB()) ? l0.o(Yg.a(xg2.b(), Xg.c()), xg2.d()) : l0.h();
                    while (true) {
                        int i10 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        q qVar = (q) it.next();
                        SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) qVar.d();
                        String str = (String) qVar.g();
                        if (baseInputData.getDepth().getEnabled()) {
                            Xg xg3 = Xg.f26013a;
                            xg3.getClass();
                            JSONArray jSONArrayOptJSONArray = ((JSONObject) Xg.f26018f.getValue(xg3, Xg.f26014b[1])).optJSONArray(str);
                            if (jSONArrayOptJSONArray != null) {
                                s.h(jSONArrayOptJSONArray, "<this>");
                                arrayList = new ArrayList();
                                int length = jSONArrayOptJSONArray.length();
                                while (i10 < length) {
                                    Object obj = jSONArrayOptJSONArray.get(i10);
                                    s.g(obj, "get(...)");
                                    arrayList.add(obj);
                                    i10++;
                                }
                            } else {
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(0);
                                jSONArray.put(0);
                                jSONArray.put(0);
                                jSONArray.put(0);
                                s.h(jSONArray, "<this>");
                                arrayList = new ArrayList();
                                int length2 = jSONArray.length();
                                while (i10 < length2) {
                                    Object obj2 = jSONArray.get(i10);
                                    s.g(obj2, "get(...)");
                                    arrayList.add(obj2);
                                    i10++;
                                }
                            }
                            mapV.put(str, arrayList);
                        }
                    }
                } catch (Exception e10) {
                    k kVar = W9.f25935a;
                    W9.a(new M2(e10));
                    mapH = l0.h();
                }
                mapV = l0.v(mapH);
                it = r.o(w.a(Xg.c().getObj(), "o_i_dep"), w.a(Xg.c().getDirect(), "d_i_dep")).iterator();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapV.entrySet()) {
                    if (!bm.r.N((String) entry.getKey(), "auto_", false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            } catch (Exception e11) {
                k kVar2 = W9.f25935a;
                W9.a(new M2(e11));
                Sb.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return l0.h();
            }
        }

        public final void putPublisherSignals(Map<String, ? extends Object> signals) {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                s.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                Sb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
            } else if (signals != null) {
                Xg.f26013a.getClass();
                Xg.a(signals);
            }
        }

        public final void resetPublisherSignals() {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                s.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                Sb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
            } else {
                Xg.f26013a.getClass();
                Context context = Xi.f26021a;
                if (context == null || em.k.d(H9.f24932e, null, null, new Ug(context, null), 3, null) == null) {
                    g0 g0Var = g0.f38750a;
                }
            }
        }
    }

    public static void a(final Context context, final String str, final JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        AbstractC2971fk.a(new Runnable() { // from class: zh.b
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.a(context, sdkInitializationListener, str, jSONObject);
            }
        });
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static final /* synthetic */ Map access$prepareTelemetryPayload(InMobiSdk inMobiSdk, long j10) {
        inMobiSdk.getClass();
        return a(j10);
    }

    public static final /* synthetic */ void access$provideCallback(InMobiSdk inMobiSdk, SdkInitializationListener sdkInitializationListener, String str) {
        inMobiSdk.getClass();
        a(sdkInitializationListener, str);
    }

    public static final void b(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.getClass();
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static final String getToken() {
        return getToken(null, null);
    }

    public static final String getVersion() {
        return "11.2.0";
    }

    public static final void init(Context context, String accountId, JSONObject consentObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, accountId, consentObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return Xi.d();
    }

    public static final void setAge(int age) {
        Context context = Xi.f26021a;
        if (age != Integer.MIN_VALUE) {
            AbstractC2891ch.f26337a = age;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_age", age, false);
            }
        }
    }

    public static final void setAgeGroup(AgeGroup group) {
        s.h(group, "group");
        String string = group.toString();
        Locale ENGLISH = Locale.ENGLISH;
        s.g(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        s.g(lowerCase, "toLowerCase(...)");
        Context context = Xi.f26021a;
        if (lowerCase != null) {
            AbstractC2891ch.f26339c = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_age_group", lowerCase, false);
            }
        }
    }

    public static final void setApplicationMuted(boolean muted) {
        Xi.f26026f = muted;
    }

    public static final void setAreaCode(String areaCode) {
        Context context = Xi.f26021a;
        AbstractC2891ch.f26340d = areaCode;
        if (context == null || areaCode == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        Ka.a(context, "user_info_store").a("user_area_code", areaCode, false);
    }

    public static final void setEducation(Education education) {
        s.h(education, "education");
        String string = education.toString();
        Locale ENGLISH = Locale.ENGLISH;
        s.g(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        s.g(lowerCase, "toLowerCase(...)");
        Context context = Xi.f26021a;
        if (lowerCase != null) {
            AbstractC2891ch.f26347k = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_education", lowerCase, false);
            }
        }
    }

    public static final void setGender(Gender gender) {
        s.h(gender, "gender");
        String string = gender.toString();
        Locale ENGLISH = Locale.ENGLISH;
        s.g(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        s.g(lowerCase, "toLowerCase(...)");
        Context context = Xi.f26021a;
        if (lowerCase != null) {
            AbstractC2891ch.f26346j = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_gender", lowerCase, false);
            }
        }
    }

    public static final void setInterests(String interests) {
        Context context = Xi.f26021a;
        if (interests != null) {
            AbstractC2891ch.f26349m = interests;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_interest", interests, false);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean isAgeRestricted) {
        AbstractC2891ch.a(isAgeRestricted);
        Qk.a(isAgeRestricted);
        if (isAgeRestricted) {
            InMobiUnifiedIdService.reset();
            B8.a(null);
        }
    }

    public static final void setLanguage(String language) {
        Context context = Xi.f26021a;
        if (language != null) {
            AbstractC2891ch.f26348l = language;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_language", language, false);
            }
        }
    }

    public static final void setLocation(Location location) {
        Context context = Xi.f26021a;
        if (location != null) {
            AbstractC2891ch.f26350n = location;
            if (context != null) {
                String strA = AbstractC2891ch.a(location);
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_location", strA, false);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(String city, String state, String country) {
        Context context = Xi.f26021a;
        if (city != null) {
            AbstractC2891ch.f26342f = city;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_city_code", city, false);
            }
        }
        Context context2 = Xi.f26021a;
        if (state != null) {
            AbstractC2891ch.f26343g = state;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = La.f25197b;
                Ka.a(context2, "user_info_store").a("user_state_code", state, false);
            }
        }
        Context context3 = Xi.f26021a;
        if (country != null) {
            AbstractC2891ch.f26344h = country;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = La.f25197b;
                Ka.a(context3, "user_info_store").a("user_country_code", country, false);
            }
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        int i10 = logLevel == null ? -1 : a.f28042a[logLevel.ordinal()];
        if (i10 == 1) {
            Sb.f25685a = (byte) 0;
            return;
        }
        if (i10 == 2) {
            Sb.f25685a = (byte) 1;
        } else if (i10 != 3) {
            Sb.f25685a = (byte) 2;
        } else {
            Sb.f25685a = (byte) 2;
        }
    }

    public static final void setPartnerGDPRConsent(JSONObject consentObject) {
        if (consentObject != null) {
            AbstractC2829a7.f26172b = consentObject;
        }
    }

    public static final void setPostalCode(String postalCode) {
        Context context = Xi.f26021a;
        if (postalCode != null) {
            AbstractC2891ch.f26341e = postalCode;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_post_code", postalCode, false);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(JSONObject jsonObject) {
        s.g("InMobiSdk", "TAG");
        Objects.toString(jsonObject);
        G9 runnable = new G9(jsonObject);
        Context context = Xi.f26021a;
        s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void setYearOfBirth(int yearOfBirth) {
        Context context = Xi.f26021a;
        if (yearOfBirth != Integer.MIN_VALUE) {
            AbstractC2891ch.f26345i = yearOfBirth;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                Ka.a(context, "user_info_store").a("user_yob", yearOfBirth, false);
            }
        }
    }

    public static final void updateGDPRConsent(JSONObject consentObject) {
        AbstractC2829a7.a(consentObject);
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        if (context == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C3231pl.a()) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = s.i(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String accountId = str.subSequence(i10, length + 1).toString();
        try {
            AbstractC2829a7.a(jSONObject);
            if (accountId.length() == 0) {
                INSTANCE.getClass();
                a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!Sf.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !Sf.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                s.g("InMobiSdk", "TAG");
                Sb.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (Xi.d()) {
                s.g("InMobiSdk", "TAG");
                INSTANCE.getClass();
                a(sdkInitializationListener, null);
                return;
            }
            if (Xi.f26029i == 1) {
                s.g("InMobiSdk", "TAG");
                return;
            }
            s.h(context, "context");
            s.h(accountId, "accountId");
            Xi.f26029i = 1;
            Xi.f26021a = context.getApplicationContext();
            Xi.f26024d.set(true);
            Xi.f26023c = accountId;
            if (!Xi.c(context)) {
                s.g("InMobiSdk", "TAG");
                Xi.f26023c = null;
                Xi.f26021a = null;
                Xi.f26029i = 3;
                INSTANCE.getClass();
                a(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            s.h(context, "context");
            E1.b(context);
            INSTANCE.getClass();
            a();
            F9 runnable = new F9(context, accountId, sdkInitializationListener, jElapsedRealtime, null);
            s.h(runnable, "runnable");
            em.k.d(Xi.f26028h, null, null, new Wi(runnable, null), 3, null);
        } catch (Exception e10) {
            s.g("InMobiSdk", "TAG");
            e10.getMessage();
            Xi.f26023c = null;
            Xi.f26021a = null;
            Xi.f26029i = 3;
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    public static final String getToken(Map<String, String> extras, String keywords) {
        return Kk.a(extras, keywords);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (Sf.a(Xi.f26021a, str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        s.g("InMobiSdk", "TAG");
        Sb.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static void a(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            AbstractC2971fk.a(new Runnable() { // from class: zh.a
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.b(sdkInitializationListener, str);
                }
            });
        }
        if (str == null) {
            s.g("InMobiSdk", "TAG");
            Sb.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + Xi.f26023c);
            return;
        }
        s.g("InMobiSdk", "TAG");
        Sb.a((byte) 1, "InMobiSdk", str);
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        s.g("InMobiSdk", "TAG");
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", B5.o());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: zh.c
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.b();
            }
        };
        Context context = Xi.f26021a;
        s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }
}
