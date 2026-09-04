package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TtmlTrackImpl extends AbstractTrack {
    SampleDescriptionBox sampleDescriptionBox;
    private long[] sampleDurations;
    List<Sample> samples;
    SubSampleInformationBox subSampleInformationBox;
    TrackMetaData trackMetaData;
    XMLSubtitleSampleEntry xmlSubtitleSampleEntry;

    public TtmlTrackImpl(String str, List<Document> list) throws IOException {
        super(str);
        this.trackMetaData = new TrackMetaData();
        this.sampleDescriptionBox = new SampleDescriptionBox();
        this.xmlSubtitleSampleEntry = new XMLSubtitleSampleEntry();
        this.samples = new ArrayList();
        this.subSampleInformationBox = new SubSampleInformationBox();
        extractLanguage(list);
        HashSet hashSet = new HashSet();
        this.sampleDurations = new long[list.size()];
        XPathFactory.newInstance().newXPath().setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        for (int i10 = 0; i10 < list.size(); i10++) {
            Document document = list.get(i10);
            SubSampleInformationBox.SubSampleEntry subSampleEntry = new SubSampleInformationBox.SubSampleEntry();
            this.subSampleInformationBox.getEntries().add(subSampleEntry);
            subSampleEntry.setSampleDelta(1L);
            this.sampleDurations[i10] = extractDuration(document);
            List<byte[]> listExtractImages = extractImages(document);
            hashSet.addAll(extractMimeTypes(document));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            TtmlHelpers.pretty(document, byteArrayOutputStream, 4);
            SubSampleInformationBox.SubSampleEntry.SubsampleEntry subsampleEntry = new SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
            subsampleEntry.setSubsampleSize(byteArrayOutputStream.size());
            subSampleEntry.getSubsampleEntries().add(subsampleEntry);
            for (byte[] bArr : listExtractImages) {
                byteArrayOutputStream.write(bArr);
                SubSampleInformationBox.SubSampleEntry.SubsampleEntry subsampleEntry2 = new SubSampleInformationBox.SubSampleEntry.SubsampleEntry();
                subsampleEntry2.setSubsampleSize(bArr.length);
                subSampleEntry.getSubsampleEntries().add(subsampleEntry2);
            }
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.samples.add(new Sample() { // from class: com.googlecode.mp4parser.authoring.tracks.ttml.TtmlTrackImpl.1
                @Override // com.googlecode.mp4parser.authoring.Sample
                public ByteBuffer asByteBuffer() {
                    return ByteBuffer.wrap(byteArray);
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public long getSize() {
                    return byteArray.length;
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
                    writableByteChannel.write(ByteBuffer.wrap(byteArray));
                }
            });
        }
        this.xmlSubtitleSampleEntry.setNamespace(join(",", TtmlHelpers.getAllNamespaces(list.get(0))));
        this.xmlSubtitleSampleEntry.setSchemaLocation("");
        this.xmlSubtitleSampleEntry.setAuxiliaryMimeTypes(join(",", (String[]) new ArrayList(hashSet).toArray(new String[hashSet.size()])));
        this.sampleDescriptionBox.addBox(this.xmlSubtitleSampleEntry);
        this.trackMetaData.setTimescale(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        this.trackMetaData.setLayer(65535);
    }

    protected static List<byte[]> extractImages(Document document) {
        NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile("//*/@backgroundImage").evaluate(document, XPathConstants.NODESET);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 1;
        for (int i11 = 0; i11 < nodeList.getLength(); i11++) {
            Node nodeItem = nodeList.item(i11);
            String nodeValue = nodeItem.getNodeValue();
            String strSubstring = nodeValue.substring(nodeValue.lastIndexOf("."));
            String str = (String) linkedHashMap.get(nodeValue);
            if (str == null) {
                str = "urn:mp4parser:" + i10 + strSubstring;
                linkedHashMap.put(str, nodeValue);
                i10++;
            }
            nodeItem.setNodeValue(str);
        }
        ArrayList arrayList = new ArrayList();
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(streamToByteArray(new URI(document.getDocumentURI()).resolve((String) ((Map.Entry) it.next()).getValue()).toURL().openStream()));
            }
        }
        return arrayList;
    }

    public static String getLanguage(Document document) {
        return document.getDocumentElement().getAttribute("xml:lang");
    }

    private static String join(String str, String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArr) {
            sb2.append(str2);
            sb2.append(str);
        }
        sb2.setLength(sb2.length() > 0 ? sb2.length() - 1 : 0);
        return sb2.toString();
    }

    private static long latestTimestamp(Document document) {
        XPath xPathNewXPath = XPathFactory.newInstance().newXPath();
        xPathNewXPath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        try {
            NodeList nodeList = (NodeList) xPathNewXPath.compile("//*[name()='p']").evaluate(document, XPathConstants.NODESET);
            long jMax = 0;
            for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
                jMax = Math.max(TtmlHelpers.getEndTime(nodeList.item(i10)), jMax);
            }
            return jMax;
        } catch (XPathExpressionException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static byte[] streamToByteArray(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    long extractDuration(Document document) {
        return lastTimestamp(document) - firstTimestamp(document);
    }

    protected void extractLanguage(List<Document> list) {
        Iterator<Document> it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            String language = getLanguage(it.next());
            if (str == null) {
                this.trackMetaData.setLanguage(Locale.forLanguageTag(language).getISO3Language());
                str = language;
            } else if (!str.equals(language)) {
                throw new RuntimeException("Within one Track all sample documents need to have the same language");
            }
        }
    }

    protected long firstTimestamp(Document document) {
        XPath xPathNewXPath = XPathFactory.newInstance().newXPath();
        xPathNewXPath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        try {
            NodeList nodeList = (NodeList) xPathNewXPath.compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
            long jMin = Long.MAX_VALUE;
            for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
                jMin = Math.min(TtmlHelpers.getStartTime(nodeList.item(i10)), jMin);
            }
            return jMin;
        } catch (XPathExpressionException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return "subt";
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        int length = this.sampleDurations.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = (this.sampleDurations[i10] * this.trackMetaData.getTimescale()) / 1000;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.subSampleInformationBox;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    protected long lastTimestamp(Document document) {
        XPath xPathNewXPath = XPathFactory.newInstance().newXPath();
        xPathNewXPath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        try {
            NodeList nodeList = (NodeList) xPathNewXPath.compile("//*[@end]").evaluate(document, XPathConstants.NODESET);
            long jMax = 0;
            for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
                jMax = Math.max(TtmlHelpers.getEndTime(nodeList.item(i10)), jMax);
            }
            return jMax;
        } catch (XPathExpressionException e10) {
            throw new RuntimeException(e10);
        }
    }

    protected List<String> extractMimeTypes(Document document) {
        NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile("//*/@smpte:backgroundImage").evaluate(document, XPathConstants.NODESET);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            String nodeValue = nodeList.item(i10).getNodeValue();
            String strSubstring = nodeValue.substring(nodeValue.lastIndexOf("."));
            if (!strSubstring.contains("jpg") && !strSubstring.contains(dOIDCKnIR.pOCMBPJgrHr)) {
                if (strSubstring.contains("png")) {
                    linkedHashSet.add("image/png");
                }
            } else {
                linkedHashSet.add("image/jpeg");
            }
        }
        return new ArrayList(linkedHashSet);
    }
}
