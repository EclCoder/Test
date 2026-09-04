package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e extends RecyclerView.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager2.i f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewPager2 f7659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView f7660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f7661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f7664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7670m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7673c;

        a() {
        }

        void a() {
            this.f7671a = -1;
            this.f7672b = 0.0f;
            this.f7673c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f7659b = viewPager2;
        RecyclerView recyclerView = viewPager2.f7619j;
        this.f7660c = recyclerView;
        this.f7661d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f7664g = new a();
        l();
    }

    private void a(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f7658a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void b(int i10) {
        ViewPager2.i iVar = this.f7658a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void c(int i10) {
        if ((this.f7662e == 3 && this.f7663f == 0) || this.f7663f == i10) {
            return;
        }
        this.f7663f = i10;
        ViewPager2.i iVar = this.f7658a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    private int d() {
        return this.f7661d.findFirstVisibleItemPosition();
    }

    private boolean i() {
        int i10 = this.f7662e;
        return i10 == 1 || i10 == 4;
    }

    private void l() {
        this.f7662e = 0;
        this.f7663f = 0;
        this.f7664g.a();
        this.f7665h = -1;
        this.f7666i = -1;
        this.f7667j = false;
        this.f7668k = false;
        this.f7670m = false;
        this.f7669l = false;
    }

    private void n(boolean z10) {
        this.f7670m = z10;
        this.f7662e = z10 ? 4 : 1;
        int i10 = this.f7666i;
        if (i10 != -1) {
            this.f7665h = i10;
            this.f7666i = -1;
        } else if (this.f7665h == -1) {
            this.f7665h = d();
        }
        c(1);
    }

    private void o() {
        int top;
        a aVar = this.f7664g;
        int iFindFirstVisibleItemPosition = this.f7661d.findFirstVisibleItemPosition();
        aVar.f7671a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View viewFindViewByPosition = this.f7661d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f7661d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f7661d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f7661d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f7661d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f7661d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f7660c.getPaddingLeft();
            if (this.f7659b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f7660c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f7673c = i10;
        if (i10 >= 0) {
            aVar.f7672b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f7661d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f7673c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    double e() {
        o();
        a aVar = this.f7664g;
        return ((double) aVar.f7671a) + ((double) aVar.f7672b);
    }

    int f() {
        return this.f7663f;
    }

    boolean g() {
        return this.f7670m;
    }

    boolean h() {
        return this.f7663f == 0;
    }

    void j() {
        this.f7669l = true;
    }

    void k(int i10, boolean z10) {
        this.f7662e = z10 ? 2 : 3;
        this.f7670m = false;
        boolean z11 = this.f7666i != i10;
        this.f7666i = i10;
        c(2);
        if (z11) {
            b(i10);
        }
    }

    void m(ViewPager2.i iVar) {
        this.f7658a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        if (!(this.f7662e == 1 && this.f7663f == 1) && i10 == 1) {
            n(false);
            return;
        }
        if (i() && i10 == 2) {
            if (this.f7668k) {
                c(2);
                this.f7667j = true;
                return;
            }
            return;
        }
        if (i() && i10 == 0) {
            o();
            if (this.f7668k) {
                a aVar = this.f7664g;
                if (aVar.f7673c == 0) {
                    int i11 = this.f7665h;
                    int i12 = aVar.f7671a;
                    if (i11 != i12) {
                        b(i12);
                    }
                }
            } else {
                int i13 = this.f7664g.f7671a;
                if (i13 != -1) {
                    a(i13, 0.0f, 0);
                }
            }
            c(0);
            l();
        }
        if (this.f7662e == 2 && i10 == 0 && this.f7669l) {
            o();
            a aVar2 = this.f7664g;
            if (aVar2.f7673c == 0) {
                int i14 = this.f7666i;
                int i15 = aVar2.f7671a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    b(i15);
                }
                c(0);
                l();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        a aVar;
        int i12;
        this.f7668k = true;
        o();
        if (this.f7667j) {
            this.f7667j = false;
            if (i11 > 0) {
                aVar = this.f7664g;
                if (aVar.f7673c != 0) {
                    i12 = aVar.f7671a + 1;
                } else {
                    i12 = this.f7664g.f7671a;
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f7659b.d()) {
                        aVar = this.f7664g;
                        if (aVar.f7673c != 0) {
                            i12 = aVar.f7671a + 1;
                        }
                    }
                }
                i12 = this.f7664g.f7671a;
            }
            this.f7666i = i12;
            if (this.f7665h != i12) {
                b(i12);
            }
        } else if (this.f7662e == 0) {
            int i13 = this.f7664g.f7671a;
            if (i13 == -1) {
                i13 = 0;
            }
            b(i13);
        }
        a aVar2 = this.f7664g;
        int i14 = aVar2.f7671a;
        if (i14 == -1) {
            i14 = 0;
        }
        a(i14, aVar2.f7672b, aVar2.f7673c);
        a aVar3 = this.f7664g;
        int i15 = aVar3.f7671a;
        int i16 = this.f7666i;
        if ((i15 == i16 || i16 == -1) && aVar3.f7673c == 0 && this.f7663f != 1) {
            c(0);
            l();
        }
    }
}
