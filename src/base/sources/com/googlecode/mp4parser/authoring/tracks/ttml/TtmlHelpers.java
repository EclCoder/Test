package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TtmlHelpers {
    public static final String SMPTE_TT_NAMESPACE = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
    public static final String TTML_NAMESPACE = "http://www.w3.org/ns/ttml";
    static byte[] namespacesStyleSheet1 = "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n    <xsl:output method=\"text\"/>\n    <xsl:key name=\"kElemByNSURI\"\n             match=\"*[namespace::*[not(. = ../../namespace::*)]]\"\n              use=\"namespace::*[not(. = ../../namespace::*)]\"/>\n    <xsl:template match=\"/\">\n        <xsl:for-each select=\n            \"//namespace::*[not(. = ../../namespace::*)]\n                           [count(..|key('kElemByNSURI',.)[1])=1]\">\n            <xsl:value-of select=\"concat(.,'&#xA;')\"/>\n        </xsl:for-each>\n    </xsl:template>\n</xsl:stylesheet>".getBytes();
    public static final NamespaceContext NAMESPACE_CONTEXT = new TextTrackNamespaceContext(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class TextTrackNamespaceContext implements NamespaceContext {
        private TextTrackNamespaceContext() {
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getNamespaceURI(String str) {
            if (str.equals("ttml")) {
                return TtmlHelpers.TTML_NAMESPACE;
            }
            if (str.equals("smpte")) {
                return TtmlHelpers.SMPTE_TT_NAMESPACE;
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getPrefix(String str) {
            if (str.equals(TtmlHelpers.TTML_NAMESPACE)) {
                return "ttml";
            }
            if (str.equals(TtmlHelpers.SMPTE_TT_NAMESPACE)) {
                return "smpte";
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public Iterator getPrefixes(String str) {
            return Arrays.asList("ttml", "smpte").iterator();
        }

        /* synthetic */ TextTrackNamespaceContext(TextTrackNamespaceContext textTrackNamespaceContext) {
            this();
        }
    }

    private static long copyLarge(InputStream inputStream, File file) throws IOException {
        byte[] bArr = new byte[16384];
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (-1 == i10) {
                    fileOutputStream.close();
                    return j10;
                }
                fileOutputStream.write(bArr, 0, i10);
                j10 += (long) i10;
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        }
    }

    public static void deepCopyDocument(Document document, File file) throws IOException {
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile("//*/@backgroundImage").evaluate(document, XPathConstants.NODESET);
            for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
                URI uriCreate = URI.create(nodeList.item(i10).getNodeValue());
                if (!uriCreate.isAbsolute()) {
                    copyLarge(new URI(document.getDocumentURI()).resolve(uriCreate).toURL().openStream(), new File(file.toURI().resolve(uriCreate).toURL().getFile()));
                }
            }
            copyLarge(new URI(document.getDocumentURI()).toURL().openStream(), file);
        } catch (URISyntaxException e10) {
            throw new IOException(e10);
        } catch (XPathExpressionException e11) {
            throw new IOException(e11);
        }
    }

    public static String[] getAllNamespaces(Document document) {
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer(new StreamSource(new ByteArrayInputStream(namespacesStyleSheet1)));
            StringWriter stringWriter = new StringWriter();
            transformerNewTransformer.transform(new DOMSource(document), new StreamResult(stringWriter));
            ArrayList arrayList = new ArrayList(new LinkedHashSet(Arrays.asList(stringWriter.getBuffer().toString().split("\n"))));
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (TransformerConfigurationException e10) {
            throw new RuntimeException(e10);
        } catch (TransformerException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static long getEndTime(Node node) {
        long time = 0;
        Node parentNode = node;
        while (true) {
            parentNode = parentNode.getParentNode();
            if (parentNode == null) {
                break;
            }
            if (parentNode.getAttributes() != null && parentNode.getAttributes().getNamedItem("begin") != null) {
                time += toTime(parentNode.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }
        return (node.getAttributes() == null || node.getAttributes().getNamedItem(TtmlNode.END) == null) ? time : time + toTime(node.getAttributes().getNamedItem(TtmlNode.END).getNodeValue());
    }

    public static long getStartTime(Node node) {
        long time = 0;
        Node parentNode = node;
        while (true) {
            parentNode = parentNode.getParentNode();
            if (parentNode == null) {
                break;
            }
            if (parentNode.getAttributes() != null && parentNode.getAttributes().getNamedItem("begin") != null) {
                time += toTime(parentNode.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }
        return (node.getAttributes() == null || node.getAttributes().getNamedItem("begin") == null) ? time : time + toTime(node.getAttributes().getNamedItem("begin").getNodeValue());
    }

    public static void main(String[] strArr) {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        TtmlTrackImpl ttmlTrackImpl = new TtmlTrackImpl("a.xml", TtmlSegmenter.split(documentBuilderFactoryNewInstance.newDocumentBuilder().parse("C:\\dev\\mp4parser\\a.xml"), 60));
        Movie movie = new Movie();
        movie.addTrack(ttmlTrackImpl);
        new DefaultMp4Builder().build(movie).writeContainer(new FileOutputStream("output.mp4").getChannel());
    }

    public static void pretty(Document document, OutputStream outputStream, int i10) {
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", C.UTF8_NAME);
            if (i10 > 0) {
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(i10));
            }
            try {
                transformerNewTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
            } catch (TransformerException e10) {
                throw new IOException(e10);
            }
        } catch (TransformerConfigurationException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static String toTimeExpression(long j10) {
        return toTimeExpression(j10, -1);
    }

    public static long toTime(String str) {
        long j10;
        Matcher matcher = Pattern.compile("(-?)([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?").matcher(str);
        if (!matcher.matches()) {
            throw new RuntimeException("Cannot match '" + str + "' to time expression");
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        String strGroup4 = matcher.group(4);
        String strGroup5 = matcher.group(5);
        if (strGroup5 == null) {
            strGroup5 = ".000";
        }
        String strReplace = strGroup5.replace(":", ".");
        long j11 = (Long.parseLong(strGroup2) * 3600000) + (Long.parseLong(strGroup3) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (Long.parseLong(strGroup4) * 1000);
        boolean zContains = strReplace.contains(":");
        String str2 = IAoPeRfJn.ANSmBtTS;
        if (zContains) {
            j10 = (long) (j11 + (Double.parseDouble(str2 + strReplace.replace(":", ".")) * 40.0d * 1000.0d));
        } else {
            j10 = (long) (j11 + (Double.parseDouble(str2 + strReplace) * 1000.0d));
        }
        return j10 * ((long) ("-".equals(strGroup) ? -1 : 1));
    }

    public static String toTimeExpression(long j10, int i10) {
        String str = j10 >= 0 ? "" : "-";
        long jAbs = Math.abs(j10);
        long j11 = ((jAbs / 1000) / 60) / 60;
        long j12 = jAbs - (3600000 * j11);
        long j13 = (j12 / 1000) / 60;
        long j14 = j12 - (ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS * j13);
        long j15 = j14 / 1000;
        return i10 >= 0 ? String.format("%s%02d:%02d:%02d:%d", str, Long.valueOf(j11), Long.valueOf(j13), Long.valueOf(j15), Integer.valueOf(i10)) : String.format("%s%02d:%02d:%02d.%03d", str, Long.valueOf(j11), Long.valueOf(j13), Long.valueOf(j15), Long.valueOf(j14 - (1000 * j15)));
    }
}
