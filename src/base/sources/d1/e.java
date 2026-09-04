package d1;

import em.o0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import z0.i0;
import z0.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f36099a = new e();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f36100a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(tl.a aVar) {
            super(0);
            this.f36100a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f36100a.invoke();
            if (s.c(ql.f.p(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                s.g(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final z0.h a(a1.b bVar, List migrations, o0 scope, tl.a produceFile) {
        s.h(migrations, "migrations");
        s.h(scope, "scope");
        s.h(produceFile, "produceFile");
        return new d(b(new n(h.f36102a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }

    public final z0.h b(i0 storage, a1.b bVar, List migrations, o0 scope) {
        s.h(storage, "storage");
        s.h(migrations, "migrations");
        s.h(scope, "scope");
        return new d(z0.i.f58270a.b(storage, bVar, migrations, scope));
    }
}
