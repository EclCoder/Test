package l0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d f43692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f43693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f43694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f43695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f43696h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f43699c;

    /* JADX INFO: renamed from: l0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0662a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f43700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f43702c;

        public C0662a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f43696h : a.f43695g;
        }

        private void c(boolean z10) {
            this.f43700a = z10;
            this.f43702c = a.f43692d;
            this.f43701b = 2;
        }

        public a a() {
            return (this.f43701b == 2 && this.f43702c == a.f43692d) ? b(this.f43700a) : new a(this.f43700a, this.f43701b, this.f43702c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f43703f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f43704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f43705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f43706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f43708e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f43703f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f43704a = charSequence;
            this.f43705b = z10;
            this.f43706c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f43703f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f43707d;
            do {
                int i11 = this.f43707d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f43704a;
                int i12 = i11 - 1;
                this.f43707d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f43708e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f43707d = i10;
            this.f43708e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f43707d;
                if (i10 >= this.f43706c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f43704a;
                this.f43707d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f43708e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f43707d;
            while (true) {
                int i11 = this.f43707d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f43704a;
                int i12 = i11 - 1;
                this.f43707d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f43708e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f43707d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f43704a;
                        int i14 = i13 - 1;
                        this.f43707d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f43708e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f43707d = i10;
            this.f43708e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f43707d;
            while (true) {
                int i11 = this.f43707d;
                if (i11 >= this.f43706c) {
                    this.f43707d = i10;
                    this.f43708e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f43704a;
                this.f43707d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f43708e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f43707d;
                        if (i12 >= this.f43706c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f43704a;
                        this.f43707d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f43708e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f43704a.charAt(this.f43707d - 1);
            this.f43708e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f43704a, this.f43707d);
                this.f43707d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f43707d--;
            byte bC = c(this.f43708e);
            if (!this.f43705b) {
                return bC;
            }
            char c10 = this.f43708e;
            if (c10 == '>') {
                return h();
            }
            return c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f43704a.charAt(this.f43707d);
            this.f43708e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f43704a, this.f43707d);
                this.f43707d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f43707d++;
            byte bC = c(this.f43708e);
            if (!this.f43705b) {
                return bC;
            }
            char c10 = this.f43708e;
            if (c10 == '<') {
                return i();
            }
            return c10 == '&' ? g() : bC;
        }

        int d() {
            this.f43707d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f43707d < this.f43706c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f43707d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f43707d = this.f43706c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f43707d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f43720c;
        f43692d = dVar;
        f43693e = Character.toString((char) 8206);
        f43694f = Character.toString((char) 8207);
        f43695g = new a(false, 2, dVar);
        f43696h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f43697a = z10;
        this.f43698b = i10;
        this.f43699c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0662a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f43697a && (zIsRtl || b(charSequence) == 1)) {
            return f43693e;
        }
        if (this.f43697a) {
            return (!zIsRtl || b(charSequence) == -1) ? f43694f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f43697a && (zIsRtl || a(charSequence) == 1)) {
            return f43693e;
        }
        if (this.f43697a) {
            return (!zIsRtl || a(charSequence) == -1) ? f43694f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f43698b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f43699c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? e.f43719b : e.f43718a));
        }
        if (zIsRtl != this.f43697a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? e.f43719b : e.f43718a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f43699c, true);
    }

    public String k(String str, d dVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z10).toString();
    }
}
