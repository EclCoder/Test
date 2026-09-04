package s0;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class b extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f51448a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void a(Cursor cursor);

        Cursor b(CharSequence charSequence);

        Cursor c();

        CharSequence convertToString(Cursor cursor);
    }

    b(a aVar) {
        this.f51448a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f51448a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorB = this.f51448a.b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorB != null) {
            filterResults.count = cursorB.getCount();
            filterResults.values = cursorB;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorC = this.f51448a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorC) {
            return;
        }
        this.f51448a.a((Cursor) obj);
    }
}
