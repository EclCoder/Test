package sp;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends tp.a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f52469d = new a(0, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f52470e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final long serialVersionUID = -8290556941213247973L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52473c;

    private a(int i10, int i11, int i12) {
        this.f52471a = i10;
        this.f52472b = i11;
        this.f52473c = i12;
    }

    private static a a(int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? f52469d : new a(i10, i11, i12);
    }

    public static a i(CharSequence charSequence) {
        up.a.a(charSequence, "text");
        Matcher matcher = f52470e.matcher(charSequence);
        if (matcher.matches()) {
            int i10 = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    return a(j(charSequence, strGroup, i10), j(charSequence, strGroup2, i10), up.a.b(j(charSequence, strGroup4, i10), up.a.c(j(charSequence, strGroup3, i10), 7)));
                } catch (NumberFormatException e10) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e10));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int j(CharSequence charSequence, String str, int i10) {
        if (str == null) {
            return 0;
        }
        try {
            return up.a.c(Integer.parseInt(str), i10);
        } catch (ArithmeticException e10) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e10));
        }
    }

    private Object readResolve() {
        return ((this.f52471a | this.f52472b) | this.f52473c) == 0 ? f52469d : this;
    }

    public int d() {
        return this.f52473c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f52471a == aVar.f52471a && this.f52472b == aVar.f52472b && this.f52473c == aVar.f52473c) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        return this.f52472b;
    }

    public int h() {
        return this.f52471a;
    }

    public int hashCode() {
        return this.f52471a + Integer.rotateLeft(this.f52472b, 8) + Integer.rotateLeft(this.f52473c, 16);
    }

    public String toString() {
        if (this == f52469d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        int i10 = this.f52471a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f52472b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f52473c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
