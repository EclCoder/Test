package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.activity.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c[] f36052a;

        public b(c[] cVarArr) {
            this.f36052a = cVarArr;
        }

        public c[] a() {
            return this.f36052a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f36057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f36058f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f36053a = str;
            this.f36054b = i10;
            this.f36055c = z10;
            this.f36056d = str2;
            this.f36057e = i11;
            this.f36058f = i12;
        }

        public String a() {
            return this.f36053a;
        }

        public int b() {
            return this.f36058f;
        }

        public int c() {
            return this.f36057e;
        }

        public String d() {
            return this.f36056d;
        }

        public int e() {
            return this.f36054b;
        }

        public boolean f() {
            return this.f36055c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f36059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36062d;

        public d(List list, int i10, int i11, String str) {
            this.f36059a = list;
            this.f36061c = i10;
            this.f36060b = i11;
            this.f36062d = str;
        }

        public int a() {
            return this.f36061c;
        }

        public List b() {
            return this.f36059a;
        }

        public String c() {
            return this.f36062d;
        }

        public int d() {
            return this.f36060b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return typedArray.getType(i10);
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static k0.e d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.B);
        try {
            String string = typedArrayObtainAttributes.getString(b0.d.C);
            String string2 = typedArrayObtainAttributes.getString(b0.d.D);
            String string3 = typedArrayObtainAttributes.getString(b0.d.E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            k0.e eVar = new k0.e(str, str2, string, list, string2, string3);
            a0.a(typedArrayObtainAttributes);
            return eVar;
        } catch (Throwable th2) {
            if (typedArrayObtainAttributes == null) {
                throw th2;
            }
            try {
                a0.a(typedArrayObtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    private static a f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.f8239h);
        String string = typedArrayObtainAttributes.getString(b0.d.f8240i);
        String string2 = typedArrayObtainAttributes.getString(b0.d.f8245n);
        String string3 = typedArrayObtainAttributes.getString(b0.d.f8246o);
        String string4 = typedArrayObtainAttributes.getString(b0.d.f8242k);
        int resourceId = typedArrayObtainAttributes.getResourceId(b0.d.f8241j, 0);
        int integer = typedArrayObtainAttributes.getInteger(b0.d.f8243l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(b0.d.f8244m, 500);
        String string5 = typedArrayObtainAttributes.getString(b0.d.f8247p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[0]));
        }
        List listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new d(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new k0.e(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new k0.e(string, string2, string4, listC, null, null));
        }
        return new d(arrayList2, integer, integer2, string5);
    }

    private static c g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b0.d.f8248q);
        int i10 = b0.d.f8257z;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = b0.d.f8250s;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = b0.d.f8255x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = b0.d.f8251t;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = b0.d.A;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = b0.d.f8252u;
        }
        int i14 = b0.d.f8256y;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = b0.d.f8253v;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = b0.d.f8254w;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = b0.d.f8249r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new c(string2, i11, z10, string, i15, resourceId);
    }

    private static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
