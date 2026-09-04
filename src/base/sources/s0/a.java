package s0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, s0.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f51438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f51439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f51440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f51441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f51442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0795a f51443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f51444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected s0.b f51445h;

    /* JADX INFO: renamed from: s0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class C0795a extends ContentObserver {
        C0795a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f51438a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f51438a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // s0.b.a
    public Cursor c() {
        return this.f51440c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f51439b = true;
        } else {
            this.f51439b = false;
        }
        boolean z10 = cursor != null;
        this.f51440c = cursor;
        this.f51438a = z10;
        this.f51441d = context;
        this.f51442e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f51443f = new C0795a();
            this.f51444g = new b();
        } else {
            this.f51443f = null;
            this.f51444g = null;
        }
        if (z10) {
            C0795a c0795a = this.f51443f;
            if (c0795a != null) {
                cursor.registerContentObserver(c0795a);
            }
            DataSetObserver dataSetObserver = this.f51444g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f51438a || (cursor = this.f51440c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f51438a) {
            return null;
        }
        this.f51440c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f51441d, this.f51440c, viewGroup);
        }
        d(view, this.f51441d, this.f51440c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f51445h == null) {
            this.f51445h = new s0.b(this);
        }
        return this.f51445h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f51438a || (cursor = this.f51440c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f51440c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f51438a && (cursor = this.f51440c) != null && cursor.moveToPosition(i10)) {
            return this.f51440c.getLong(this.f51442e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f51438a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f51440c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f51441d, this.f51440c, viewGroup);
            }
            d(view, this.f51441d, this.f51440c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f51439b || (cursor = this.f51440c) == null || cursor.isClosed()) {
            return;
        }
        this.f51438a = this.f51440c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f51440c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0795a c0795a = this.f51443f;
            if (c0795a != null) {
                cursor2.unregisterContentObserver(c0795a);
            }
            DataSetObserver dataSetObserver = this.f51444g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f51440c = cursor;
        if (cursor == null) {
            this.f51442e = -1;
            this.f51438a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0795a c0795a2 = this.f51443f;
        if (c0795a2 != null) {
            cursor.registerContentObserver(c0795a2);
        }
        DataSetObserver dataSetObserver2 = this.f51444g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f51442e = cursor.getColumnIndexOrThrow("_id");
        this.f51438a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
