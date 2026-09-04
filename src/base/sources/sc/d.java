package sc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements q {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class a extends d {
        a() {
        }

        @Override // sc.q
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f52289a;

        b(char c10) {
            this.f52289a = c10;
        }

        @Override // sc.d
        public boolean e(char c10) {
            return c10 == this.f52289a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f52289a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f52290a;

        c(String str) {
            this.f52290a = (String) p.o(str);
        }

        public final String toString() {
            return this.f52290a;
        }
    }

    /* JADX INFO: renamed from: sc.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0800d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f52291b = new C0800d();

        private C0800d() {
            super("CharMatcher.none()");
        }

        @Override // sc.d
        public int c(CharSequence charSequence, int i10) {
            p.s(i10, charSequence.length());
            return -1;
        }

        @Override // sc.d
        public boolean e(char c10) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0800d.f52291b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        p.s(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
