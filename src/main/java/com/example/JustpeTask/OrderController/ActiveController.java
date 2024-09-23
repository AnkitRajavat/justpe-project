package com.example.JustpeTask.OrderController;


import com.example.JustpeTask.OderService.ActiveService;
import com.example.JustpeTask.OderService.BussinessTypeservice;
import com.example.JustpeTask.OderService.ServiceImp;
import com.example.JustpeTask.OrderEntity.ActivationBussiness;
import com.example.JustpeTask.OrderEntity.BussinessDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.UUID;

@Controller
public class ActiveController {


    @Autowired
    public BussinessDetails bussinessDetails;

    @Autowired
    private BussinessTypeservice bussinessTypeservice;

    @Autowired
    private ServiceImp serviceImp;


    @Autowired
    public ActiveService activeService;

    @Value("${C:\\Learning things\\java\\files}")  // Path to store files
    private String uploadDir;

    @PostMapping("/submit")
    public String registerBusiness(@ModelAttribute ActivationBussiness form,
                                   @RequestParam("tradeLicenseFile") MultipartFile  tradeLicense,
                                   @RequestParam("partnershipDeedFile") MultipartFile partnershipDeed,
                                   @RequestParam("coiFile") MultipartFile coi,
                                   @RequestParam("authSignFile") MultipartFile authSign,
                                   @RequestParam("aadhaarFile") MultipartFile aadhaar,
                                   @RequestParam("panCardFile") MultipartFile panCard,
                                   @RequestParam("declarationLetterFile") MultipartFile declarationLetter,
                                   @RequestParam("bankDocumentFile") MultipartFile bankDocument,
                                   @RequestParam("shopPhotoFile") MultipartFile shopPhoto,
                                   @RequestParam("nonSignBoardDeclarationLetterFile") MultipartFile nonSignBoardDeclarationLetter,
                                   @RequestParam("gstDeclarationLetterFile") MultipartFile gstDeclarationLetter,

                                   Model model) throws IOException {

        ActivationBussiness business = new ActivationBussiness();
        business.setPhoneNumber(form.getPhoneNumber());
        business.setEmail(form.getEmail());
        business.setBussinessType(form.getBussinessType());



        if (!tradeLicense.isEmpty()) {
            String tradeLicensePath = saveFile(tradeLicense);
            business.setTradeLicense(tradeLicensePath);
        }

        if (!partnershipDeed.isEmpty()) {
            String partnershipDeedPath = saveFile(partnershipDeed);
            business.setPartnershipDeed(partnershipDeedPath);
        }

        if (!coi.isEmpty()) {
            String coiPath = saveFile(coi);
            business.setCoi(coiPath);
        }

        if (!authSign.isEmpty()) {
            String authSignPath = saveFile(authSign);
            business.setAuthSign(authSignPath);
        }

        if (!aadhaar.isEmpty()) {
            String aadhaarPath = saveFile(aadhaar);
            business.setAadhaar(aadhaarPath);
        }

        if (!panCard.isEmpty()) {
            String panCardPath = saveFile(panCard);
            business.setPanCard(panCardPath);
        }

        if (!declarationLetter.isEmpty()) {
            String declarationLetterPath = saveFile(declarationLetter);
            business.setDeclarationLetter(declarationLetterPath);
        }

        if (!bankDocument.isEmpty()) {
            String bankDocumentPath = saveFile(bankDocument);
            business.setBankDocument(bankDocumentPath);
        }

        if (!shopPhoto.isEmpty()) {
            String shopPhotoPath = saveFile(shopPhoto);
            business.setShopPhoto(shopPhotoPath);
        }

        if (!nonSignBoardDeclarationLetter.isEmpty()) {
            String nonSignBoardDeclarationLetterPath = saveFile(nonSignBoardDeclarationLetter);
            business.setNonSignBoardDeclarationLetter(nonSignBoardDeclarationLetterPath);
        }

        if (!gstDeclarationLetter.isEmpty()) {
            String gstDeclarationLetterPath = saveFile(gstDeclarationLetter);
            business.setGstDeclarationLetter(gstDeclarationLetterPath);
        }


        activeService.savedata(business);
        model.addAttribute("success", "Registration successful!");

        return "Message";
    }

//    @PostMapping("/submit")
//    public String saveform(@ModelAttribute ActivationBussiness activationBussiness,Model model){
//        activeService.savedata(activationBussiness);
//        return"Message";
//    }






    @GetMapping("/activition")
    public String newform( Model model ){


        BussinessDetails bussinessDetails=serviceImp.findLastUser();
        model.addAttribute("bussinessDetails",bussinessDetails);
        model.addAttribute("active",new ActivationBussiness());
        return "Activation_form";
    }



    @GetMapping("/activition/{id}")
    public String activateUser(@PathVariable Long id,Model model){

    BussinessDetails bussinessDetails= serviceImp.getdatabyid(id);
        model.addAttribute("bussinessDetails",bussinessDetails);
        model.addAttribute("active",new ActivationBussiness());
        return "Activation_form";
    }



    private String saveFile(MultipartFile file) throws IOException {
        String filename = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        Path filePath = Paths.get(uploadDir, filename);
        Files.write(filePath, file.getBytes());
        return filePath.toString();
    }
}
