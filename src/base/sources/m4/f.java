package m4;

import android.database.Cursor;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f45238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f45239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f45240d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f45244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f45246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f45247g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f45241a = str;
            this.f45242b = str2;
            this.f45244d = z10;
            this.f45245e = i10;
            this.f45243c = a(str2);
            this.f45246f = str3;
            this.f45247g = i11;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f45245e != aVar.f45245e || !this.f45241a.equals(aVar.f45241a) || this.f45244d != aVar.f45244d) {
                    return false;
                }
                if (this.f45247g == 1 && aVar.f45247g == 2 && (str3 = this.f45246f) != null && !str3.equals(aVar.f45246f)) {
                    return false;
                }
                if (this.f45247g == 2 && aVar.f45247g == 1 && (str2 = aVar.f45246f) != null && !str2.equals(this.f45246f)) {
                    return false;
                }
                int i10 = this.f45247g;
                if ((i10 == 0 || i10 != aVar.f45247g || ((str = this.f45246f) == null ? aVar.f45246f == null : str.equals(aVar.f45246f))) && this.f45243c == aVar.f45243c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f45241a.hashCode() * 31) + this.f45243c) * 31) + (this.f45244d ? 1231 : 1237)) * 31) + this.f45245e;
        }

        public String toString() {
            return "Column{name='" + this.f45241a + "', type='" + this.f45242b + "', affinity='" + this.f45243c + "', notNull=" + this.f45244d + ", primaryKeyPosition=" + this.f45245e + ", defaultValue='" + this.f45246f + "'}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f45250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f45251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f45252e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.f45248a = str;
            this.f45249b = str2;
            this.f45250c = str3;
            this.f45251d = Collections.unmodifiableList(list);
            this.f45252e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f45248a.equals(bVar.f45248a) && this.f45249b.equals(bVar.f45249b) && this.f45250c.equals(bVar.f45250c) && this.f45251d.equals(bVar.f45251d)) {
                return this.f45252e.equals(bVar.f45252e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f45248a.hashCode() * 31) + this.f45249b.hashCode()) * 31) + this.f45250c.hashCode()) * 31) + this.f45251d.hashCode()) * 31) + this.f45252e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f45248a + "', onDelete='" + this.f45249b + "', onUpdate='" + this.f45250c + "', columnNames=" + this.f45251d + ", referenceColumnNames=" + this.f45252e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f45253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f45254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f45255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f45256d;

        c(int i10, int i11, String str, String str2) {
            this.f45253a = i10;
            this.f45254b = i11;
            this.f45255c = str;
            this.f45256d = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f45253a - cVar.f45253a;
            return i10 == 0 ? this.f45254b - cVar.f45254b : i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f45258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f45259c;

        public d(String str, boolean z10, List list) {
            this.f45257a = str;
            this.f45258b = z10;
            this.f45259c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f45258b == dVar.f45258b && this.f45259c.equals(dVar.f45259c)) {
                return this.f45257a.startsWith("index_") ? dVar.f45257a.startsWith("index_") : this.f45257a.equals(dVar.f45257a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f45257a.startsWith("index_") ? -1184239155 : this.f45257a.hashCode()) * 31) + (this.f45258b ? 1 : 0)) * 31) + this.f45259c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f45257a + "', unique=" + this.f45258b + ", columns=" + this.f45259c + '}';
        }
    }

    public f(String str, Map map, Set set, Set set2) {
        this.f45237a = str;
        this.f45238b = Collections.unmodifiableMap(map);
        this.f45239c = Collections.unmodifiableSet(set);
        this.f45240d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(p4.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map b(p4.b bVar, String str) {
        Cursor cursorV0 = bVar.v0("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorV0.getColumnCount() > 0) {
                int columnIndex = cursorV0.getColumnIndex("name");
                int columnIndex2 = cursorV0.getColumnIndex("type");
                int columnIndex3 = cursorV0.getColumnIndex("notnull");
                int columnIndex4 = cursorV0.getColumnIndex("pk");
                int columnIndex5 = cursorV0.getColumnIndex("dflt_value");
                while (cursorV0.moveToNext()) {
                    String string = cursorV0.getString(columnIndex);
                    map.put(string, new a(string, cursorV0.getString(columnIndex2), cursorV0.getInt(columnIndex3) != 0, cursorV0.getInt(columnIndex4), cursorV0.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorV0.close();
        }
    }

    private static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set d(p4.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorV0 = bVar.v0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorV0.getColumnIndex("id");
            int columnIndex2 = cursorV0.getColumnIndex("seq");
            int columnIndex3 = cursorV0.getColumnIndex("table");
            int columnIndex4 = cursorV0.getColumnIndex("on_delete");
            int columnIndex5 = cursorV0.getColumnIndex("on_update");
            List<c> listC = c(cursorV0);
            int count = cursorV0.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                cursorV0.moveToPosition(i10);
                if (cursorV0.getInt(columnIndex2) == 0) {
                    int i11 = cursorV0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f45253a == i11) {
                            arrayList.add(cVar.f45255c);
                            arrayList2.add(cVar.f45256d);
                        }
                    }
                    hashSet.add(new b(cursorV0.getString(columnIndex3), cursorV0.getString(columnIndex4), cursorV0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorV0.close();
        }
    }

    private static d e(p4.b bVar, String str, boolean z10) {
        Cursor cursorV0 = bVar.v0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorV0.getColumnIndex("seqno");
            int columnIndex2 = cursorV0.getColumnIndex(BidResponsedEx.KEY_CID);
            int columnIndex3 = cursorV0.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorV0.moveToNext()) {
                    if (cursorV0.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorV0.getInt(columnIndex)), cursorV0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z10, arrayList);
            }
            return null;
        } finally {
            cursorV0.close();
        }
    }

    private static Set f(p4.b bVar, String str) {
        Cursor cursorV0 = bVar.v0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorV0.getColumnIndex("name");
            int columnIndex2 = cursorV0.getColumnIndex("origin");
            int columnIndex3 = cursorV0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorV0.moveToNext()) {
                    if ("c".equals(cursorV0.getString(columnIndex2))) {
                        String string = cursorV0.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorV0.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d dVarE = e(bVar, string, z10);
                        if (dVarE == null) {
                            cursorV0.close();
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                cursorV0.close();
                return hashSet;
            }
            cursorV0.close();
            return null;
        } catch (Throwable th2) {
            cursorV0.close();
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f45237a;
        if (str == null ? fVar.f45237a != null : !str.equals(fVar.f45237a)) {
            return false;
        }
        Map map = this.f45238b;
        if (map == null ? fVar.f45238b != null : !map.equals(fVar.f45238b)) {
            return false;
        }
        Set set2 = this.f45239c;
        if (set2 == null ? fVar.f45239c != null : !set2.equals(fVar.f45239c)) {
            return false;
        }
        Set set3 = this.f45240d;
        if (set3 == null || (set = fVar.f45240d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f45237a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f45238b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f45239c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f45237a + "', columns=" + this.f45238b + ", foreignKeys=" + this.f45239c + ", indices=" + this.f45240d + '}';
    }
}
