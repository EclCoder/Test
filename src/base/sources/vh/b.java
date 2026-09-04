package vh;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class b {
    private static a.C0840a a(XmlResourceParser xmlResourceParser) {
        a.C0840a c0840a = new a.C0840a();
        c0840a.f55565a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        c0840a.f55566b = xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "supportsPictureInPicture", false);
        return c0840a;
    }

    static a b(Context context, int i10) throws IOException {
        a aVar = new a();
        XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser(i10, "AndroidManifest.xml");
        do {
            if (xmlResourceParserOpenXmlResourceParser.getEventType() == 2) {
                String name = xmlResourceParserOpenXmlResourceParser.getName();
                if (TextUtils.equals("manifest", name)) {
                    aVar.f55559a = xmlResourceParserOpenXmlResourceParser.getAttributeValue(null, "package");
                }
                if (TextUtils.equals("uses-sdk", name)) {
                    aVar.f55560b = f(xmlResourceParserOpenXmlResourceParser);
                }
                if (TextUtils.equals("uses-permission", name) || TextUtils.equals("uses-permission-sdk-23", name) || TextUtils.equals("uses-permission-sdk-m", name)) {
                    aVar.f55561c.add(d(xmlResourceParserOpenXmlResourceParser));
                }
                if (TextUtils.equals(MimeTypes.BASE_TYPE_APPLICATION, name)) {
                    aVar.f55562d = c(xmlResourceParserOpenXmlResourceParser);
                }
                if (TextUtils.equals("activity", name) || TextUtils.equals("activity-alias", name)) {
                    aVar.f55563e.add(a(xmlResourceParserOpenXmlResourceParser));
                }
                if (TextUtils.equals(NotificationCompat.CATEGORY_SERVICE, name)) {
                    aVar.f55564f.add(e(xmlResourceParserOpenXmlResourceParser));
                }
            }
        } while (xmlResourceParserOpenXmlResourceParser.next() != 1);
        xmlResourceParserOpenXmlResourceParser.close();
        return aVar;
    }

    private static a.b c(XmlResourceParser xmlResourceParser) {
        a.b bVar = new a.b();
        bVar.f55567a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        bVar.f55568b = xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "requestLegacyExternalStorage", false);
        return bVar;
    }

    private static a.c d(XmlResourceParser xmlResourceParser) {
        a.c cVar = new a.c();
        cVar.f55569a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        cVar.f55570b = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxSdkVersion", Integer.MAX_VALUE);
        cVar.f55571c = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "usesPermissionFlags", 0);
        return cVar;
    }

    private static a.d e(XmlResourceParser xmlResourceParser) {
        a.d dVar = new a.d();
        dVar.f55572a = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        dVar.f55573b = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "permission");
        return dVar;
    }

    private static a.e f(XmlResourceParser xmlResourceParser) {
        a.e eVar = new a.e();
        eVar.f55574a = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minSdkVersion", 0);
        return eVar;
    }
}
