package com.codename1.uikit.gui;

import com.codename1.components.ToastBar;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.Layout;
import com.codename1.ui.util.Resources;

/**
 * Common code that can setup the side menu
 *
 * @author Shai Almog
 */
public abstract class SideMenuBaseForm extends Form {

    public SideMenuBaseForm(String title, Layout contentPaneLayout) {
        super(title, contentPaneLayout);
    }

    public SideMenuBaseForm(String title) {
        super(title);
    }

    public SideMenuBaseForm() {
    }

    public SideMenuBaseForm(Layout contentPaneLayout) {
        super(contentPaneLayout);
    }
    
    public void setupSideMenu(Resources res) {
        Image profilePic = res.getImage("user-picture.jpg");
        Image mask = res.getImage("round-mask.png");
        mask = mask.scaledHeight(mask.getHeight() / 4 * 3);
        profilePic = profilePic.fill(mask.getWidth(), mask.getHeight());
        Label profilePicLabel = new Label("  Jennifer Wilson", profilePic, "SideMenuTitle");
        profilePicLabel.setMask(mask.createMask());

        Container sidemenuTop = BorderLayout.center(profilePicLabel);
        sidemenuTop.setUIID("SidemenuTop");
        
        getToolbar().addComponentToSideMenu(sidemenuTop);
        getToolbar().addMaterialCommandToSideMenu("  Profil", FontImage.MATERIAL_DASHBOARD,  e -> showOtherForm2(res));
        getToolbar().addMaterialCommandToSideMenu("  Document", FontImage.MATERIAL_TRENDING_UP,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Notes", FontImage.MATERIAL_ACCESS_TIME,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Absences", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Emploi du temps", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Cahier de text ", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Permutation", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Cantine", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Reclamation", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Logout", FontImage.MATERIAL_EXIT_TO_APP,  e -> new LoginForm(res).show());
    }
    
        public void setupSideMenu2(Resources res) {
        Image profilePic = res.getImage("user-picture.jpg");
        Image mask = res.getImage("round-mask.png");
        mask = mask.scaledHeight(mask.getHeight() / 4 * 3);
        profilePic = profilePic.fill(mask.getWidth(), mask.getHeight());
        Label profilePicLabel = new Label("  Jennifer Wilson", profilePic, "SideMenuTitle");
        profilePicLabel.setMask(mask.createMask());

        Container sidemenuTop = BorderLayout.center(profilePicLabel);
        sidemenuTop.setUIID("SidemenuTop");
        
        getToolbar().addComponentToSideMenu(sidemenuTop);
        getToolbar().addMaterialCommandToSideMenu("  Profil", FontImage.MATERIAL_DASHBOARD,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Emploi du temps", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Absences ", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Documents", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Classe", FontImage.MATERIAL_SETTINGS,  e -> showOtherForm(res));
        getToolbar().addMaterialCommandToSideMenu("  Logout", FontImage.MATERIAL_EXIT_TO_APP,  e -> new LoginForm(res).show());
    } 
    
    protected void showOtherForm(Resources res){
        new StatsForm(res).show();
    };
     protected void showOtherForm2(Resources res){
        new ProfileForm(res).show();
    };
}
