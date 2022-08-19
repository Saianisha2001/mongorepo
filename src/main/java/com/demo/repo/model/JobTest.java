package com.demo.repo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value="jobTest")
public class JobTest {
    @Id
    private String id;
    private String address;
    private int bookingfee;
    private int cancellationfee;
    private String city;
    private Coordinates coordinates;
    private String createdby;
    private String createdbyuid;
    private long creationdate;
    private int currentstatus;
    private boolean hasdeadline;
    private long invoicecreationdate;
    private long invoicecreationdates;
    private List<Jobstatus> jobstatus;
//    Jobstatus jobstatus;
    private String invoiceid;
    private String invoiceurl;
    private boolean ismerchremainded;
    private String jobcompletiondate;
    private String jobcurrentstatus;
    private String jobidui;
    private String jobnotes;
    private String jobtitle;
    private long laststatusupdateddate;
    private double merchavgratings;
    private String merchfeedback;
    private String merchname ;
    private int merchphoneno;
    private String merchphoto;
    private String merchsuccessfulljobs;
    private String merchtimeslot;
    private String merchuid;
    private int netpaymerch;
    private int netpaystore;
    private int noofcases;
    private String orgid;
    private String proofofwork;
    private double ratepercase;
    private String rejectreason;
    private String state;
    private double storeavgratings;
    private String storecode;
    private String storefeedback;
    private String storeid;
    private String storename;
    private int storenoofratings;
    private int storephoneno;
    private String storeworkinghours;
    private int totalcostforcases;
    private int yodecopercentage;
    private int zipcode;

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBookingfee(int bookingfee) {
        this.bookingfee = bookingfee;
    }

    public void setCancellationfee(int cancellationfee) {
        this.cancellationfee = cancellationfee;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public void setCreatedbyuid(String createdbyuid) {
        this.createdbyuid = createdbyuid;
    }

    public void setCreationdate(long creationdate) {
        this.creationdate = creationdate;
    }

    public void setCurrentstatus(int currentstatus) {
        this.currentstatus = currentstatus;
    }

    public void setHasdeadline(boolean hasdeadline) {
        this.hasdeadline = hasdeadline;
    }

    public void setInvoicecreationdate(long invoicecreationdate) {
        this.invoicecreationdate = invoicecreationdate;
    }

    public void setInvoicecreationdates(long invoicecreationdates) {
        this.invoicecreationdates = invoicecreationdates;
    }

    public void setJobstatus(List<Jobstatus> jobstatus) {
        this.jobstatus = jobstatus;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public void setInvoiceurl(String invoiceurl) {
        this.invoiceurl = invoiceurl;
    }

    public void setIsmerchremainded(boolean ismerchremainded) {
        this.ismerchremainded = ismerchremainded;
    }

    public void setJobcompletiondate(String jobcompletiondate) {
        this.jobcompletiondate = jobcompletiondate;
    }

    public void setJobcurrentstatus(String jobcurrentstatus) {
        this.jobcurrentstatus = jobcurrentstatus;
    }

    public void setJobidui(String jobidui) {
        this.jobidui = jobidui;
    }

    public void setJobnotes(String jobnotes) {
        this.jobnotes = jobnotes;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public void setLaststatusupdateddate(long laststatusupdateddate) {
        this.laststatusupdateddate = laststatusupdateddate;
    }

    public void setMerchavgratings(double merchavgratings) {
        this.merchavgratings = merchavgratings;
    }

    public void setMerchfeedback(String merchfeedback) {
        this.merchfeedback = merchfeedback;
    }

    public void setMerchname(String merchname) {
        this.merchname = merchname;
    }

    public void setMerchphoneno(int merchphoneno) {
        this.merchphoneno = merchphoneno;
    }

    public void setMerchphoto(String merchphoto) {
        this.merchphoto = merchphoto;
    }

    public void setMerchsuccessfulljobs(String merchsuccessfulljobs) {
        this.merchsuccessfulljobs = merchsuccessfulljobs;
    }

    public void setMerchtimeslot(String merchtimeslot) {
        this.merchtimeslot = merchtimeslot;
    }

    public void setMerchuid(String merchuid) {
        this.merchuid = merchuid;
    }

    public void setNetpaymerch(int netpaymerch) {
        this.netpaymerch = netpaymerch;
    }

    public void setNetpaystore(int netpaystore) {
        this.netpaystore = netpaystore;
    }

    public void setNoofcases(int noofcases) {
        this.noofcases = noofcases;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public void setProofofwork(String proofofwork) {
        this.proofofwork = proofofwork;
    }

    public void setRatepercase(double ratepercase) {
        this.ratepercase = ratepercase;
    }

    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStoreavgratings(double storeavgratings) {
        this.storeavgratings = storeavgratings;
    }

    public void setStorecode(String storecode) {
        this.storecode = storecode;
    }

    public void setStorefeedback(String storefeedback) {
        this.storefeedback = storefeedback;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public void setStorenoofratings(int storenoofratings) {
        this.storenoofratings = storenoofratings;
    }

    public void setStorephoneno(int storephoneno) {
        this.storephoneno = storephoneno;
    }

    public void setStoreworkinghours(String storeworkinghours) {
        this.storeworkinghours = storeworkinghours;
    }

    public void setTotalcostforcases(int totalcostforcases) {
        this.totalcostforcases = totalcostforcases;
    }

    public void setYodecopercentage(int yodecopercentage) {
        this.yodecopercentage = yodecopercentage;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getBookingfee() {
        return bookingfee;
    }

    public int getCancellationfee() {
        return cancellationfee;
    }

    public String getCity() {
        return city;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getCreatedbyuid() {
        return createdbyuid;
    }

    public long getCreationdate() {
        return creationdate;
    }

    public int getCurrentstatus() {
        return currentstatus;
    }

    public boolean isHasdeadline() {
        return hasdeadline;
    }

    public long getInvoicecreationdate() {
        return invoicecreationdate;
    }

    public long getInvoicecreationdates() {
        return invoicecreationdates;
    }

    public List<Jobstatus> getJobstatus() {
        return jobstatus;
    }

    public String getInvoiceid() {
        return invoiceid;
    }

    public String getInvoiceurl() {
        return invoiceurl;
    }

    public boolean isIsmerchremainded() {
        return ismerchremainded;
    }

    public String getJobcompletiondate() {
        return jobcompletiondate;
    }

    public String getJobcurrentstatus() {
        return jobcurrentstatus;
    }

    public String getJobidui() {
        return jobidui;
    }

    public String getJobnotes() {
        return jobnotes;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public long getLaststatusupdateddate() {
        return laststatusupdateddate;
    }

    public double getMerchavgratings() {
        return merchavgratings;
    }

    public String getMerchfeedback() {
        return merchfeedback;
    }

    public String getMerchname() {
        return merchname;
    }

    public int getMerchphoneno() {
        return merchphoneno;
    }

    public String getMerchphoto() {
        return merchphoto;
    }

    public String getMerchsuccessfulljobs() {
        return merchsuccessfulljobs;
    }

    public String getMerchtimeslot() {
        return merchtimeslot;
    }

    public String getMerchuid() {
        return merchuid;
    }

    public int getNetpaymerch() {
        return netpaymerch;
    }

    public int getNetpaystore() {
        return netpaystore;
    }

    public int getNoofcases() {
        return noofcases;
    }

    public String getOrgid() {
        return orgid;
    }

    public String getProofofwork() {
        return proofofwork;
    }

    public double getRatepercase() {
        return ratepercase;
    }

    public String getRejectreason() {
        return rejectreason;
    }

    public String getState() {
        return state;
    }

    public double getStoreavgratings() {
        return storeavgratings;
    }

    public String getStorecode() {
        return storecode;
    }

    public String getStorefeedback() {
        return storefeedback;
    }

    public String getStoreid() {
        return storeid;
    }

    public String getStorename() {
        return storename;
    }

    public int getStorenoofratings() {
        return storenoofratings;
    }

    public int getStorephoneno() {
        return storephoneno;
    }

    public String getStoreworkinghours() {
        return storeworkinghours;
    }

    public int getTotalcostforcases() {
        return totalcostforcases;
    }

    public int getYodecopercentage() {
        return yodecopercentage;
    }

    public int getZipcode() {
        return zipcode;
    }
}
