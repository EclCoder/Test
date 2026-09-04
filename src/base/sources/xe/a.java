package xe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a implements g {
    a() {
    }

    private static char b(char c10, char c11) {
        if (j.f(c10) && j.f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    @Override // xe.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f56820d) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f56820d), hVar.d().charAt(hVar.f56820d + 1)));
            hVar.f56820d += 2;
            return;
        }
        char c10 = hVar.c();
        int iN = j.n(hVar.d(), hVar.f56820d, c());
        if (iN == c()) {
            if (!j.g(c10)) {
                hVar.r((char) (c10 + 1));
                hVar.f56820d++;
                return;
            } else {
                hVar.r((char) 235);
                hVar.r((char) (c10 - 127));
                hVar.f56820d++;
                return;
            }
        }
        if (iN == 1) {
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (iN == 2) {
            hVar.r((char) 239);
            hVar.o(2);
            return;
        }
        if (iN == 3) {
            hVar.r((char) 238);
            hVar.o(3);
        } else if (iN == 4) {
            hVar.r((char) 240);
            hVar.o(4);
        } else {
            if (iN != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iN)));
            }
            hVar.r((char) 231);
            hVar.o(5);
        }
    }

    public int c() {
        return 0;
    }
}
