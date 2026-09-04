package lo;

import j$.util.DesugarTimeZone;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f44862a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Date f44863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeZone f44864c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ThreadLocal f44865a = new ThreadLocal();

        public static SimpleDateFormat a(String str) {
            ThreadLocal threadLocal = f44865a;
            SoftReference softReference = (SoftReference) threadLocal.get();
            Map map = softReference == null ? null : (Map) softReference.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        f44864c = timeZone;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        f44863b = calendar.getTime();
    }

    public static Date a(String str, String[] strArr) {
        return b(str, strArr, null);
    }

    public static Date b(String str, String[] strArr, Date date) {
        ip.a.h(str, "Date value");
        if (strArr == null) {
            strArr = f44862a;
        }
        if (date == null) {
            date = f44863b;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat simpleDateFormatA = a.a(str2);
            simpleDateFormatA.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date date2 = simpleDateFormatA.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return date2;
            }
        }
        return null;
    }
}
