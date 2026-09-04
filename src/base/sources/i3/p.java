package i3;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;
import o2.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final sc.t f40949d = sc.t.f(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final sc.t f40950e = sc.t.f('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f40951a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40952b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40953c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40956c;

        public a(int i10, long j10, int i11) {
            this.f40954a = i10;
            this.f40955b = j10;
            this.f40956c = i11;
        }
    }

    private void a(o2.q qVar, i0 i0Var) {
        w1.u uVar = new w1.u(8);
        qVar.readFully(uVar.e(), 0, 8);
        this.f40953c = uVar.t() + 8;
        if (uVar.p() != 1397048916) {
            i0Var.f48076a = 0L;
        } else {
            i0Var.f48076a = qVar.getPosition() - ((long) (this.f40953c - 12));
            this.f40952b = 2;
        }
    }

    private static int b(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(o2.q qVar, i0 i0Var) {
        long length = qVar.getLength();
        int i10 = this.f40953c - 20;
        w1.u uVar = new w1.u(i10);
        qVar.readFully(uVar.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            uVar.U(2);
            short sV = uVar.v();
            if (sV == 2192 || sV == 2816 || sV == 2817 || sV == 2819 || sV == 2820) {
                this.f40951a.add(new a(sV, (length - ((long) this.f40953c)) - ((long) uVar.t()), uVar.t()));
            } else {
                uVar.U(8);
            }
        }
        if (this.f40951a.isEmpty()) {
            i0Var.f48076a = 0L;
        } else {
            this.f40952b = 3;
            i0Var.f48076a = ((a) this.f40951a.get(0)).f40955b;
        }
    }

    private void e(o2.q qVar, List list) throws ParserException {
        long position = qVar.getPosition();
        int length = (int) ((qVar.getLength() - qVar.getPosition()) - ((long) this.f40953c));
        w1.u uVar = new w1.u(length);
        qVar.readFully(uVar.e(), 0, length);
        for (int i10 = 0; i10 < this.f40951a.size(); i10++) {
            a aVar = (a) this.f40951a.get(i10);
            uVar.T((int) (aVar.f40955b - position));
            uVar.U(4);
            int iT = uVar.t();
            int iB = b(uVar.D(iT));
            int i11 = aVar.f40956c - (iT + 8);
            if (iB == 2192) {
                list.add(f(uVar, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static d3.b f(w1.u uVar, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List listJ = f40950e.j(uVar.D(i10));
        for (int i11 = 0; i11 < listJ.size(); i11++) {
            List listJ2 = f40949d.j((CharSequence) listJ.get(i11));
            if (listJ2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new d3.b.C0543b(Long.parseLong((String) listJ2.get(0)), Long.parseLong((String) listJ2.get(1)), 1 << (Integer.parseInt((String) listJ2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.a(null, e10);
            }
        }
        return new d3.b(arrayList);
    }

    public int c(o2.q qVar, i0 i0Var, List list) throws ParserException {
        int i10 = this.f40952b;
        long j10 = 0;
        if (i10 == 0) {
            long length = qVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i0Var.f48076a = j10;
            this.f40952b = 1;
        } else if (i10 == 1) {
            a(qVar, i0Var);
        } else if (i10 == 2) {
            d(qVar, i0Var);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(qVar, list);
            i0Var.f48076a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f40951a.clear();
        this.f40952b = 0;
    }
}
