/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119069.trinovarelrahmadhani;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class ServicePrice implements ServiceItem {
    private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3): ");
    }
    
    public float getPrice(int serviceItem) {
        int harga = 0;
        switch (serviceItem) {
            case 1:
                harga = 45;
                break;
            case 2:
                harga = 55;
                break;
            case 3:
                harga = 15;
                break;
            default:
                break;
        }
        return harga;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
