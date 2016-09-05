<%--
    JSP Fragment for provider type selection form.

    @author j3_guile
    @version 1.0
 --%>

<%@page import="gov.medicaid.entities.dto.ViewStatics"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<div class="providerPanel">
    <input type="hidden" name="formNames" value="<%= ViewStatics.INDIVIDUAL_DISCLOSURE_FORM %>">
    <div class="tableHeader">
        <span>Provider Disclosure</span>
    </div>
    <div class="clearFixed"></div>
    <div class="disclosure">
        <div class="row">
            <label>Have you ever been convicted of a criminal offense related to involvement in any program under Medicare, Medicaid, Title XX, or Title XXI in
                Minnesota or any other state or jurisdiction since the inception of these programs?<span class="required">*</span></label>
            <div>
                <c:set var="formName" value="_08_criminalConvictionInd"></c:set>
                <c:set var="formValue" value="${requestScope[formName]}"></c:set>
                <input type="radio" value="Y" name="${formName}" ${formValue eq 'Y' ? 'checked' : ''} /><label class="span">Yes</label>
                <input type="radio" value="N" name="${formName}" ${formValue eq 'N' ? 'checked' : ''} /><label class="span">No</label>
            </div>
        </div>
        <div class="row">
            <label>Have you had civil money penalties or assessments imposed under section 1128A of the Social Security Act?<span class="required">*</span></label>
            <div>
                <c:set var="formName" value="_08_civilPenaltyInd"></c:set>
                <c:set var="formValue" value="${requestScope[formName]}"></c:set>
                <input type="radio" value="Y" name="${formName}" ${formValue eq 'Y' ? 'checked' : ''} /><label class="span">Yes</label>
                <input type="radio" value="N" name="${formName}" ${formValue eq 'N' ? 'checked' : ''} /><label class="span">No</label>
            </div>
        </div>
        <div class="row">
            <label>Have you ever been excluded or terminated from participation in Medicare, Medicaid, Children's Health Insurance Program (CHIP),<br />
                or the Title XXI services program in Minnesota or any other state since the inception of these programs?<span class="required">*</span></label>
            <div>
                <c:set var="formName" value="_08_previousExclusionInd"></c:set>
                <c:set var="formValue" value="${requestScope[formName]}"></c:set>
                <input type="radio" value="Y" name="${formName}" ${formValue eq 'Y' ? 'checked' : ''} /><label class="span">Yes</label>
                <input type="radio" value="N" name="${formName}" ${formValue eq 'N' ? 'checked' : ''} /><label class="span">No</label>
            </div>
        </div>
        <div class="clearFixed"></div>
    </div>
    <div class="tableHeader otherTableHeader">
        <span>Provider Statement</span>
    </div>
    <div class="clearFixed"></div>
    <div class="statement">
        <div class="section">
            <div class="row">
                <p>
                    I certify that the information provided on this form is accurate, complete and truthful.
                    I will notify MHCP Provider Enrollment of any changes to this information. I acknowledge
                    that any misrepresentations in the information submitted to MHCP, including false claims,
                    statements, documents, or concealment of a material fact, may be cause for denial or termination
                    of participation as a Medicaid provider.
                </p>
            </div>
            <div class="row">
                <label>Provider Name<span class="required">*</span></label>
                <span class="floatL"><b>:</b></span>
                <c:set var="formName" value="_08_name"></c:set>
                <c:set var="formValue" value="${requestScope[formName]}"></c:set>
                <input type="text" class="normalInput" name="${formName}" value="${formValue}" maxlength="45"/>
            </div>
            <div class="row titleRow">
                <label>Provider Title<span class="required">*</span></label>
                <span class="floatL"><b>:</b></span>
                <c:set var="formName" value="_08_title"></c:set>
                <c:set var="formValue" value="${requestScope[formName]}"></c:set>
                <input type="text" class="normalInput" name="${formName}" value="${formValue}" maxlength="45"/>
            </div>
            <c:set var="formName" value="_08_requiredAgreementsSize"></c:set>
            <c:forEach begin="1" end="${requestScope[formName]}" varStatus="status">
	            <div class="checkRow">
	                <c:set var="formName" value="_08_accepted_${status.index - 1}"></c:set>
		            <c:set var="formValue" value="${requestScope[formName]}"></c:set>
	                <input type="checkbox" value="" class="checkbox" ${formValue eq 'Y' ? 'checked' : ''} name="${formName}"/>
                    <c:set var="formName" value="_08_documentId_${status.index - 1}"></c:set>
                    <c:set var="documentId" value="${requestScope[formName]}"></c:set>
	                <input type="hidden" value="${documentId}" name="${formName}"/>
                    <c:set var="formName" value="_08_documentName_${status.index - 1}"></c:set>
                    <c:set var="documentName" value="${requestScope[formName]}"></c:set>
                    <c:url var="viewDocumentUrl" value="/provider/enrollment/agreement"><c:param name="id" value="${documentId}"></c:param></c:url>
	                <span>I have read and agree to the terms of the</span><a href="${viewDocumentUrl}" target="_blank">${documentName}</a>
                    <c:set var="formName" value="_08_updatedVersion_${status.index - 1}"></c:set>
                    <c:set var="formValue" value="${requestScope[formName]}"></c:set>
	                <c:if test="${formValue eq 'Y'}"><span>(Updated)</span></c:if>
	            </div>
            </c:forEach>
            <div class="clearFixed"></div>
        </div>
        <div class="bottomSection">
            <div class="row">
                <label>Date<span class="required">*</span></label>
                <span class="floatL"><b>:</b></span>
                <span class="dateWrapper">
	                <c:set var="formName" value="_08_date"></c:set>
	                <c:set var="formValue" value="${requestScope[formName]}"></c:set>
                    <input class="date" type="text" name="${formName}" value="${formValue}"/>
                </span>
            </div>
            <div class="clearFixed"></div>
        </div>
    </div>
    <div class="tl"></div>
    <div class="tr"></div>
    <div class="bl"></div>
    <div class="br"></div>
</div>
