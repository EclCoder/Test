package nd;

import android.util.Base64;
import android.util.JsonReader;
import c1.pGX.geAgcEazw;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wd.a f47085a = new yd.d().j(md.a.f45767a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        Object a(JsonReader jsonReader);
    }

    private static h0.f.d.AbstractC0708f A(JsonReader jsonReader) throws IOException {
        h0.f.d.AbstractC0708f.a aVarA = h0.f.d.AbstractC0708f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new a() { // from class: nd.f
                    @Override // nd.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.d.a.b.AbstractC0701d B(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.AbstractC0701d.AbstractC0702a abstractC0702aA = h0.f.d.a.b.AbstractC0701d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC0702aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0702aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0702aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0702aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.b.e C(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.e.AbstractC0703a abstractC0703aA = h0.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0703aA.b(n(jsonReader, new i()));
                    break;
                case "name":
                    abstractC0703aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0703aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0703aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.d.b D(JsonReader jsonReader) throws IOException {
        h0.d.b.a aVarA = h0.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.d E(JsonReader jsonReader) throws IOException {
        h0.d.a aVarA = h0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new a() { // from class: nd.e
                    @Override // nd.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.e F(JsonReader jsonReader) throws IOException {
        h0.f.e.a aVarA = h0.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.c G(JsonReader jsonReader) throws IOException {
        h0.f.d.a.c.AbstractC0706a abstractC0706aA = h0.f.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC0706aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0706aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0706aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0706aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0706aA.a();
    }

    private static h0.e H(JsonReader jsonReader) throws IOException {
        h0.e.a aVarA = h0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("profilingTrigger")) {
                aVarA.b(I(jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.e.b I(JsonReader jsonReader) throws IOException {
        h0.e.b.a aVarA = h0.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("trigger")) {
                aVarA.b(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0 J(JsonReader jsonReader) throws IOException {
        h0.b bVarB = h0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(L(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    private static h0.f.d.e.b K(JsonReader jsonReader) throws IOException {
        h0.f.d.e.b.a aVarA = h0.f.d.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f L(JsonReader jsonReader) throws IOException {
        h0.f.b bVarA = h0.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: nd.d
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(M(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static h0.f.AbstractC0709f M(JsonReader jsonReader) throws IOException {
        h0.f.AbstractC0709f.a aVarA = h0.f.AbstractC0709f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.a l(JsonReader jsonReader) throws IOException {
        h0.f.a.AbstractC0695a abstractC0695aA = h0.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC0695aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0695aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0695aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0695aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0695aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0695aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0695aA.a();
    }

    private static h0.a m(JsonReader jsonReader) throws IOException {
        h0.a.b bVarA = h0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: nd.a
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static List n(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.a.AbstractC0693a o(JsonReader jsonReader) throws IOException {
        h0.a.AbstractC0693a.AbstractC0694a abstractC0694aA = h0.a.AbstractC0693a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC0694aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0694aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0694aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0694aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.c p(JsonReader jsonReader) throws IOException {
        h0.c.a aVarA = h0.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.c q(JsonReader jsonReader) throws IOException {
        h0.f.c.a aVarA = h0.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.d.a s(JsonReader jsonReader) throws IOException {
        h0.f.d.a.AbstractC0696a abstractC0696aA = h0.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0696aA.b(n(jsonReader, new a() { // from class: nd.c
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0696aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0696aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0696aA.g(n(jsonReader, new a() { // from class: nd.b
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0696aA.e(n(jsonReader, new a() { // from class: nd.b
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0696aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0696aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0696aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.b.AbstractC0697a t(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.AbstractC0697a.AbstractC0698a abstractC0698aA = h0.f.d.a.b.AbstractC0697a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC0698aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0698aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0698aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0698aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0698aA.a();
    }

    private static h0.f.d.c u(JsonReader jsonReader) throws IOException {
        h0.f.d.c.a aVarA = h0.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static h0.f.d.a.b v(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.AbstractC0699b abstractC0699bA = h0.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0699bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC0699bA.g(n(jsonReader, new a() { // from class: nd.g
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0699bA.f(B(jsonReader));
                    break;
                case "binaries":
                    abstractC0699bA.c(n(jsonReader, new a() { // from class: nd.h
                        @Override // nd.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "profilingManagerInfo":
                    abstractC0699bA.e(H(jsonReader));
                    break;
                case "exception":
                    abstractC0699bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0699bA.a();
    }

    private static h0.f.d.a.b.c w(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.c.AbstractC0700a abstractC0700aA = h0.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0700aA.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    abstractC0700aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0700aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0700aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0700aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0700aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.a.b.e.AbstractC0704b x(JsonReader jsonReader) throws IOException {
        h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a abstractC0705aA = h0.f.d.a.b.e.AbstractC0704b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC0705aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0705aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0705aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0705aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0705aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0705aA.a();
    }

    private static h0.f.d.AbstractC0707d y(JsonReader jsonReader) throws IOException {
        h0.f.d.AbstractC0707d.a aVarA = h0.f.d.AbstractC0707d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public h0.e N(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                h0.e eVarH = H(jsonReader);
                jsonReader.close();
                return eVarH;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String O(h0.e eVar) {
        return f47085a.b(eVar);
    }

    public h0 P(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                h0 h0VarJ = J(jsonReader);
                jsonReader.close();
                return h0VarJ;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String Q(h0 h0Var) {
        return f47085a.b(h0Var);
    }

    public h0.f.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                h0.f.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String k(h0.f.d dVar) {
        return f47085a.b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d r(JsonReader jsonReader) throws IOException {
        h0.f.d.b bVarA = h0.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -1335157162:
                    if (strNextName.equals("device")) {
                        b10 = 0;
                    }
                    break;
                case -259312414:
                    if (strNextName.equals("rollouts")) {
                        b10 = 1;
                    }
                    break;
                case 96801:
                    if (strNextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        b10 = 2;
                    }
                    break;
                case 107332:
                    if (strNextName.equals("log")) {
                        b10 = 3;
                    }
                    break;
                case 3575610:
                    if (strNextName.equals(PvZsvNiPV.iEJ)) {
                        b10 = 4;
                    }
                    break;
                case 55126294:
                    if (strNextName.equals(CampaignEx.JSON_KEY_TIMESTAMP)) {
                        b10 = 5;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    bVarA.c(u(jsonReader));
                    break;
                case 1:
                    bVarA.e(A(jsonReader));
                    break;
                case 2:
                    bVarA.b(s(jsonReader));
                    break;
                case 3:
                    bVarA.d(y(jsonReader));
                    break;
                case 4:
                    bVarA.g(jsonReader.nextString());
                    break;
                case 5:
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0.f.d.e z(JsonReader jsonReader) throws IOException {
        h0.f.d.e.a aVarA = h0.f.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -1536268810:
                    if (strNextName.equals("parameterKey")) {
                        b10 = 0;
                    }
                    break;
                case -1027290370:
                    if (strNextName.equals("templateVersion")) {
                        b10 = 1;
                    }
                    break;
                case 1098747284:
                    if (strNextName.equals("rolloutVariant")) {
                        b10 = 2;
                    }
                    break;
                case 1124454216:
                    if (strNextName.equals(geAgcEazw.NAYxXikyfhmdmyf)) {
                        b10 = 3;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    aVarA.b(jsonReader.nextString());
                    break;
                case 1:
                    aVarA.e(jsonReader.nextLong());
                    break;
                case 2:
                    aVarA.d(K(jsonReader));
                    break;
                case 3:
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }
}
