public class StringOperations {
    public static void main(String[] args){
        String name = "FirstName LastName";
        System.out.println(name);
        
        String modifiedName = "A" + name.substring(1);
        int nameLastIndex = name.length() - 1;
        modifiedName = modifiedName.substring(0,nameLastIndex) + "Z";
        System.out.println(modifiedName);

        String url = "www.website.com";
        System.out.println(url);

        int firstDec = url.indexOf(".");
        int secondDec = url.lastIndexOf(".");
        String newUrl = url.substring(firstDec+1, secondDec) + "1331";
        // System.out.println(firstDec);
        // System.out.println(secondDec);
        System.out.println(newUrl);
    }
}
