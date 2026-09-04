package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class o extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f19994e = v.i().getMaximum(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f19995f = (v.i().getMaximum(5) + v.i().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n f19996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f19997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f19998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final a f19999d;

    o(n nVar, d dVar, a aVar, g gVar) {
        this.f19996a = nVar;
        this.f19999d = aVar;
        this.f19997b = dVar.p0();
    }

    private String h(Context context, long j10) {
        return e.a(context, j10, p(j10), o(j10), m(j10));
    }

    private void k(Context context) {
        if (this.f19998c == null) {
            this.f19998c = new c(context);
        }
    }

    private boolean n(long j10) {
        throw null;
    }

    private boolean p(long j10) {
        return v.g().getTimeInMillis() == j10;
    }

    private void s(TextView textView, long j10, int i10) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(h(textView.getContext(), j10));
        if (this.f19999d.g().h(j10)) {
            textView.setEnabled(true);
            boolean zN = n(j10);
            textView.setSelected(zN);
            if (zN) {
                bVar = this.f19998c.f19896b;
            } else {
                bVar = p(j10) ? this.f19998c.f19897c : this.f19998c.f19895a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f19998c.f19901g;
        }
        bVar.c(textView);
    }

    private void t(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (n.c(j10).equals(this.f19996a)) {
            int i10 = this.f19996a.i(j10);
            s((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(i10) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    int a(int i10) {
        return g() + (i10 - 1);
    }

    int b() {
        return e(g() - 1);
    }

    int c() {
        return f(q() + 1);
    }

    int d(int i10) {
        if (l(i10)) {
            return i10;
        }
        long itemId = getItemId(i10);
        for (int i11 = 1; i11 < this.f19996a.f19990d; i11++) {
            int i12 = i10 + i11;
            if (i12 < getCount() && getItemId(i12) == itemId && l(i12)) {
                return i12;
            }
            int i13 = i10 - i11;
            if (i13 >= 0 && getItemId(i13) == itemId && l(i13)) {
                return i13;
            }
        }
        return -1;
    }

    int e(int i10) {
        do {
            i10++;
            if (i10 > q()) {
                return -1;
            }
        } while (!l(i10));
        return i10;
    }

    int f(int i10) {
        do {
            i10--;
            if (i10 < g()) {
                return -1;
            }
        } while (!l(i10));
        return i10;
    }

    int g() {
        return this.f19996a.f(this.f19999d.j());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f19995f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f19996a.f19990d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < g() || i10 > q()) {
            return null;
        }
        return Long.valueOf(this.f19996a.g(r(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        k(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(sb.i.f51827z, viewGroup, false);
        }
        int iG = i10 - g();
        if (iG >= 0) {
            n nVar = this.f19996a;
            if (iG >= nVar.f19991e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iG + 1;
                textView.setTag(nVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        s(textView, item.longValue(), i11);
        return textView;
    }

    boolean l(int i10) {
        Long item = getItem(i10);
        return item != null && this.f19999d.g().h(item.longValue());
    }

    boolean m(long j10) {
        throw null;
    }

    boolean o(long j10) {
        throw null;
    }

    int q() {
        return (g() + this.f19996a.f19991e) - 1;
    }

    int r(int i10) {
        return (i10 - g()) + 1;
    }

    public void u(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f19997b.iterator();
        while (it.hasNext()) {
            t(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean v(int i10) {
        return i10 >= g() && i10 <= q();
    }
}
