package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.common.collect.g0;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f4824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f4825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f4826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f4827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f4828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f4829f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String[] f4830e = {"id", "key", TtmlNode.TAG_METADATA};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1.a f4831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f4832b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4834d;

        public a(y1.a aVar) {
            this.f4831a = aVar;
        }

        private void i(SQLiteDatabase sQLiteDatabase, e eVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f.r(eVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(eVar.f4817a));
            contentValues.put("key", eVar.f4818b);
            contentValues.put(TtmlNode.TAG_METADATA, byteArray);
            sQLiteDatabase.replaceOrThrow((String) w1.a.e(this.f4834d), null, contentValues);
        }

        private static void j(y1.a aVar, String str) throws DatabaseIOException {
            try {
                String strN = n(str);
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    y1.c.c(writableDatabase, 1, str);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        private void k(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) w1.a.e(this.f4834d), "id = ?", new String[]{Integer.toString(i10)});
        }

        private static void l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor m() {
            return this.f4831a.getReadableDatabase().query((String) w1.a.e(this.f4834d), f4830e, null, null, null, null, null);
        }

        private static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void o(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            y1.c.d(sQLiteDatabase, 1, (String) w1.a.e(this.f4833c), 1);
            l(sQLiteDatabase, (String) w1.a.e(this.f4834d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f4834d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // androidx.media3.datasource.cache.f.c
        public boolean a() throws DatabaseIOException {
            try {
                return y1.c.b(this.f4831a.getReadableDatabase(), 1, (String) w1.a.e(this.f4833c)) != -1;
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void b(HashMap map) throws DatabaseIOException {
            if (this.f4832b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f4831a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f4832b.size(); i10++) {
                    try {
                        e eVar = (e) this.f4832b.valueAt(i10);
                        if (eVar == null) {
                            k(writableDatabase, this.f4832b.keyAt(i10));
                        } else {
                            i(writableDatabase, eVar);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f4832b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void c(long j10) {
            String hexString = Long.toHexString(j10);
            this.f4833c = hexString;
            this.f4834d = n(hexString);
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void d(e eVar, boolean z10) {
            if (z10) {
                this.f4832b.delete(eVar.f4817a);
            } else {
                this.f4832b.put(eVar.f4817a, null);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void e(HashMap map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f4831a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, (e) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f4832b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void f(e eVar) {
            this.f4832b.put(eVar.f4817a, eVar);
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void g(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
            w1.a.g(this.f4832b.size() == 0);
            try {
                if (y1.c.b(this.f4831a.getReadableDatabase(), 1, (String) w1.a.e(this.f4833c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f4831a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorM = m();
                while (cursorM.moveToNext()) {
                    try {
                        e eVar = new e(cursorM.getInt(0), (String) w1.a.e(cursorM.getString(1)), f.o(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        map.put(eVar.f4818b, eVar);
                        sparseArray.put(eVar.f4817a, eVar.f4818b);
                    } catch (Throwable th3) {
                        if (cursorM != null) {
                            try {
                                cursorM.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorM.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void h() throws DatabaseIOException {
            j(this.f4831a, (String) w1.a.e(this.f4833c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        boolean a();

        void b(HashMap map);

        void c(long j10);

        void d(e eVar, boolean z10);

        void e(HashMap map);

        void f(e eVar);

        void g(HashMap map, SparseArray sparseArray);

        void h();
    }

    public f(y1.a aVar, File file, byte[] bArr, boolean z10, boolean z11) {
        w1.a.g((aVar == null && file == null) ? false : true);
        this.f4824a = new HashMap();
        this.f4825b = new SparseArray();
        this.f4826c = new SparseBooleanArray();
        this.f4827d = new SparseBooleanArray();
        a aVar2 = aVar != null ? new a(aVar) : null;
        b bVar = file != null ? new b(new File(file, CachedContentIndex.FILE_NAME), bArr, z10) : null;
        if (aVar2 == null || (bVar != null && z11)) {
            this.f4828e = (c) c0.h(bVar);
            this.f4829f = aVar2;
        } else {
            this.f4828e = aVar2;
            this.f4829f = bVar;
        }
    }

    private e c(String str) {
        int iJ = j(this.f4825b);
        e eVar = new e(iJ, str);
        this.f4824a.put(str, eVar);
        this.f4825b.put(iJ, str);
        this.f4827d.put(iJ, true);
        this.f4828e.f(eVar);
        return eVar;
    }

    static int j(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean m(String str) {
        return str.startsWith(CachedContentIndex.FILE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a2.f o(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException("Invalid value size: " + i12);
            }
            int iMin = Math.min(i12, MediaHttpUploader.DEFAULT_CHUNK_SIZE);
            byte[] bArrCopyOf = c0.f55774f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, MediaHttpUploader.DEFAULT_CHUNK_SIZE);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new a2.f(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(a2.f fVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setF = fVar.f();
        dataOutputStream.writeInt(setF.size());
        for (Map.Entry entry : setF) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void d(String str, a2.e eVar) {
        e eVarK = k(str);
        if (eVarK.b(eVar)) {
            this.f4828e.f(eVarK);
        }
    }

    public int e(String str) {
        return k(str).f4817a;
    }

    public e f(String str) {
        return (e) this.f4824a.get(str);
    }

    public Collection g() {
        return Collections.unmodifiableCollection(this.f4824a.values());
    }

    public a2.d h(String str) {
        e eVarF = f(str);
        return eVarF != null ? eVarF.d() : a2.f.f96c;
    }

    public String i(int i10) {
        return (String) this.f4825b.get(i10);
    }

    public e k(String str) {
        e eVar = (e) this.f4824a.get(str);
        return eVar == null ? c(str) : eVar;
    }

    public void l(long j10) {
        c cVar;
        this.f4828e.c(j10);
        c cVar2 = this.f4829f;
        if (cVar2 != null) {
            cVar2.c(j10);
        }
        if (this.f4828e.a() || (cVar = this.f4829f) == null || !cVar.a()) {
            this.f4828e.g(this.f4824a, this.f4825b);
        } else {
            this.f4829f.g(this.f4824a, this.f4825b);
            this.f4828e.e(this.f4824a);
        }
        c cVar3 = this.f4829f;
        if (cVar3 != null) {
            cVar3.h();
            this.f4829f = null;
        }
    }

    public void n(String str) {
        e eVar = (e) this.f4824a.get(str);
        if (eVar != null && eVar.g() && eVar.i()) {
            this.f4824a.remove(str);
            int i10 = eVar.f4817a;
            boolean z10 = this.f4827d.get(i10);
            this.f4828e.d(eVar, z10);
            if (z10) {
                this.f4825b.remove(i10);
                this.f4827d.delete(i10);
            } else {
                this.f4825b.put(i10, null);
                this.f4826c.put(i10, true);
            }
        }
    }

    public void p() {
        p1 it = g0.v(this.f4824a.keySet()).iterator();
        while (it.hasNext()) {
            n((String) it.next());
        }
    }

    public void q() {
        this.f4828e.b(this.f4824a);
        int size = this.f4826c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4825b.remove(this.f4826c.keyAt(i10));
        }
        this.f4826c.clear();
        this.f4827d.clear();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f4835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f4836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f4837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SecureRandom f4838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final w1.b f4839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g f4841g;

        public b(File file, byte[] bArr, boolean z10) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            w1.a.g((bArr == null && z10) ? false : true);
            if (bArr != null) {
                w1.a.a(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                w1.a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f4835a = z10;
            this.f4836b = cipher;
            this.f4837c = secretKeySpec;
            this.f4838d = z10 ? new SecureRandom() : null;
            this.f4839e = new w1.b(file);
        }

        private int i(e eVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (eVar.f4817a * 31) + eVar.f4818b.hashCode();
            if (i10 < 2) {
                long jB = a2.d.b(eVar.d());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jB ^ (jB >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = eVar.d().hashCode();
            }
            return i11 + iHashCode;
        }

        private e j(int i10, DataInputStream dataInputStream) throws IOException {
            a2.f fVarO;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                a2.e eVar = new a2.e();
                a2.e.g(eVar, j10);
                fVarO = a2.f.f96c.e(eVar);
            } else {
                fVarO = f.o(dataInputStream);
            }
            return new e(i11, utf, fVarO);
        }

        private boolean k(HashMap map, SparseArray sparseArray) throws Throwable {
            if (!this.f4839e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f4839e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f4836b == null) {
                                c0.l(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f4836b.init(2, (Key) c0.h(this.f4837c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f4836b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f4835a) {
                            this.f4840f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int i12 = 0;
                        for (int i13 = 0; i13 < i11; i13++) {
                            e eVarJ = j(i10, dataInputStream2);
                            map.put(eVarJ.f4818b, eVarJ);
                            sparseArray.put(eVarJ.f4817a, eVarJ.f4818b);
                            i12 += i(eVarJ, i10);
                        }
                        int i14 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i14 == i12 && z10) {
                            c0.l(dataInputStream2);
                            return true;
                        }
                        c0.l(dataInputStream2);
                        return false;
                    }
                    c0.l(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        c0.l(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        c0.l(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void l(e eVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(eVar.f4817a);
            dataOutputStream.writeUTF(eVar.f4818b);
            f.r(eVar.d(), dataOutputStream);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void m(HashMap map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamF = this.f4839e.f();
                g gVar = this.f4841g;
                if (gVar == null) {
                    this.f4841g = new g(outputStreamF);
                } else {
                    gVar.a(outputStreamF);
                }
                g gVar2 = this.f4841g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(gVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f4835a ? 1 : 0);
                    if (this.f4835a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) c0.h(this.f4838d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) c0.h(this.f4836b)).init(1, (Key) c0.h(this.f4837c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(gVar2, this.f4836b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    int i10 = 0;
                    for (e eVar : map.values()) {
                        l(eVar, dataOutputStream2);
                        i10 += i(eVar, 2);
                    }
                    dataOutputStream2.writeInt(i10);
                    this.f4839e.b(dataOutputStream2);
                    c0.l(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    c0.l(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public boolean a() {
            return this.f4839e.c();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void b(HashMap map) throws Throwable {
            if (this.f4840f) {
                e(map);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void d(e eVar, boolean z10) {
            this.f4840f = true;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void e(HashMap map) throws Throwable {
            m(map);
            this.f4840f = false;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void f(e eVar) {
            this.f4840f = true;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void g(HashMap map, SparseArray sparseArray) {
            w1.a.g(!this.f4840f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f4839e.a();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void h() {
            this.f4839e.a();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void c(long j10) {
        }
    }
}
