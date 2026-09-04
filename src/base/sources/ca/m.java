package ca;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import ob.d0;
import sc.t;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t f9814d = t.f(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final t f9815e = t.f('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9816a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9817b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9818c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9821c;

        public a(int i10, long j10, int i11) {
            this.f9819a = i10;
            this.f9820b = j10;
            this.f9821c = i11;
        }
    }

    private void a(u9.l lVar, y yVar) {
        d0 d0Var = new d0(8);
        lVar.readFully(d0Var.e(), 0, 8);
        this.f9818c = d0Var.u() + 8;
        if (d0Var.q() != 1397048916) {
            yVar.f54333a = 0L;
        } else {
            yVar.f54333a = lVar.getPosition() - ((long) (this.f9818c - 12));
            this.f9817b = 2;
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

    private void d(u9.l lVar, y yVar) {
        long length = lVar.getLength();
        int i10 = this.f9818c - 20;
        d0 d0Var = new d0(i10);
        lVar.readFully(d0Var.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            d0Var.V(2);
            short sW = d0Var.w();
            if (sW == 2192 || sW == 2816 || sW == 2817 || sW == 2819 || sW == 2820) {
                this.f9816a.add(new a(sW, (length - ((long) this.f9818c)) - ((long) d0Var.u()), d0Var.u()));
            } else {
                d0Var.V(8);
            }
        }
        if (this.f9816a.isEmpty()) {
            yVar.f54333a = 0L;
        } else {
            this.f9817b = 3;
            yVar.f54333a = ((a) this.f9816a.get(0)).f9820b;
        }
    }

    private void e(u9.l lVar, List list) throws ParserException {
        long position = lVar.getPosition();
        int length = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) this.f9818c));
        d0 d0Var = new d0(length);
        lVar.readFully(d0Var.e(), 0, length);
        for (int i10 = 0; i10 < this.f9816a.size(); i10++) {
            a aVar = (a) this.f9816a.get(i10);
            d0Var.U((int) (aVar.f9820b - position));
            d0Var.V(4);
            int iU = d0Var.u();
            int iB = b(d0Var.E(iU));
            int i11 = aVar.f9821c - (iU + 8);
            if (iB == 2192) {
                list.add(f(d0Var, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static na.c f(d0 d0Var, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List listJ = f9815e.j(d0Var.E(i10));
        for (int i11 = 0; i11 < listJ.size(); i11++) {
            List listJ2 = f9814d.j((CharSequence) listJ.get(i11));
            if (listJ2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new na.c.b(Long.parseLong((String) listJ2.get(0)), Long.parseLong((String) listJ2.get(1)), 1 << (Integer.parseInt((String) listJ2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.a(null, e10);
            }
        }
        return new na.c(arrayList);
    }

    public int c(u9.l lVar, y yVar, List list) throws ParserException {
        int i10 = this.f9817b;
        long j10 = 0;
        if (i10 == 0) {
            long length = lVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            yVar.f54333a = j10;
            this.f9817b = 1;
        } else if (i10 == 1) {
            a(lVar, yVar);
        } else if (i10 == 2) {
            d(lVar, yVar);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(lVar, list);
            yVar.f54333a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f9816a.clear();
        this.f9817b = 0;
    }
}
