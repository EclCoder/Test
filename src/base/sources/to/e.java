package to;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public List a(Reader reader) throws IOException {
        ArrayList arrayList = new ArrayList(2);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            b bVar = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return arrayList;
                }
                if (!line.isEmpty()) {
                    if (line.startsWith("//")) {
                        if (bVar == null) {
                            if (line.contains("===BEGIN ICANN DOMAINS===")) {
                                bVar = b.ICANN;
                            } else if (line.contains("===BEGIN PRIVATE DOMAINS===")) {
                                bVar = b.PRIVATE;
                            }
                        } else if (line.contains("===END ICANN DOMAINS===") || line.contains("===END PRIVATE DOMAINS===")) {
                            break;
                        }
                    } else if (bVar != null) {
                        if (line.startsWith(".")) {
                            line = line.substring(1);
                        }
                        boolean zStartsWith = line.startsWith("!");
                        if (zStartsWith) {
                            line = line.substring(1);
                        }
                        if (zStartsWith) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(line);
                        } else {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(line);
                        }
                    }
                }
            }
            if (arrayList2 != null) {
                arrayList.add(new d(bVar, arrayList2, arrayList3));
            }
        }
    }
}
