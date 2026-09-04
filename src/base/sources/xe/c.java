package xe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        hVar.f56820d--;
        int iC = c(hVar.c(), sb3);
        hVar.k();
        return iC;
    }

    private static String d(CharSequence charSequence, int i10) {
        int iCharAt = (charSequence.charAt(i10) * 1600) + (charSequence.charAt(i10 + 1) * '(') + charSequence.charAt(i10 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    static void g(h hVar, StringBuilder sb2) {
        hVar.s(d(sb2, 0));
        sb2.delete(0, 3);
    }

    @Override // xe.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (hVar.i()) {
            char c10 = hVar.c();
            hVar.f56820d++;
            int iC = c(c10, sb2);
            int iA = hVar.a() + ((sb2.length() / 3) << 1);
            hVar.q(iA);
            int iA2 = hVar.g().a() - iA;
            if (!hVar.i()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (iA2 < 2 || iA2 > 2)) {
                    iC = b(hVar, sb2, sb3, iC);
                }
                while (sb2.length() % 3 == 1 && ((iC <= 3 && iA2 != 1) || iC > 3)) {
                    iC = b(hVar, sb2, sb3, iC);
                }
                break;
            }
            if (sb2.length() % 3 == 0 && j.n(hVar.d(), hVar.f56820d, e()) != e()) {
                hVar.o(0);
                break;
            }
        }
        f(hVar, sb2);
    }

    int c(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) (c10 - '3'));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '+'));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - 'E'));
            return 2;
        }
        if (c10 < '`' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return c((char) (c10 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c10 - '`'));
        return 2;
    }

    public int e() {
        return 1;
    }

    void f(h hVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int iA = hVar.a() + length;
        hVar.q(iA);
        int iA2 = hVar.g().a() - iA;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.i()) {
                hVar.r((char) 254);
            }
        } else if (iA2 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.i()) {
                hVar.r((char) 254);
            }
            hVar.f56820d--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (iA2 > 0 || hVar.i()) {
                hVar.r((char) 254);
            }
        }
        hVar.o(0);
    }
}
