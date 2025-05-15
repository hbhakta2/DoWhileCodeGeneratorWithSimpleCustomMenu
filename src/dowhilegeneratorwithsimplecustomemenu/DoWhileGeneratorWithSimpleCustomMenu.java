package dowhilegeneratorwithsimplecustomemenu;

/**
 * A library to generate do while loop code with simple custom menu
 * @author Hardikkumar Bhakta
 */
public class DoWhileGeneratorWithSimpleCustomMenu {
    
    /**
     * DoWhileGeneratorWithSimpleCustomMenu Constructor
     */
    public DoWhileGeneratorWithSimpleCustomMenu() {
    }
    
    /**
     * Generates a do-while loop code to be used for running menu operations
     * in common Java programs
     * @param menu: formatted menu
     * @param loopCondition: loop condition to ensure loop continues or stops
     * @param loopConditionType: type of loop conditions (Boolean, String, int, 
     * Integer, Double, Long,.. .etc)
     * @return string formatted code
     */
    public String generateDoWhileLoopWithSimpleCustomMenu(String menu, 
            String loopCondition, String loopConditionType) {
        //if (isValid(loopCondition)) {
            
            String variableName = getVariableName(loopCondition);
            String inputStatement = getInputStatement(loopConditionType);
            StringBuilder sb = new StringBuilder();
            sb.append("Scanner in = new Scanner(System.in);\n");
            sb.append(loopConditionType).append(" ").append(variableName).append("; //edit this line of code if variable name is missing\n");
            
            sb.append("do {\n").append("System.out.println(\"")
                    .append(menu).append("\");").append("\n")
                    .append(" ").append(variableName)
                    .append(" = ").append(inputStatement)
                    .append(" // edit or complete this line of code if variable is missing or no value is assigned \n")
                    .append("} while (").append(loopCondition).append(");");
            return sb.toString();
        //}
        //return "";
    }
    
    /**
     * Determines loop conditional expression
     * @param loopCondition
     * @return string
     */
    private String getVariableName(String loopCondition) {
        String[] lcexpressions = null;
        if (loopCondition.contains(".")) {
            lcexpressions = loopCondition.split("\\.");
        } else if (loopCondition.contains(" ")) {
            lcexpressions = loopCondition.split(" ");
        } else if (loopCondition.contains("==")) {
            lcexpressions = loopCondition.split("==");
        } else if (loopCondition.contains(">")) {
            lcexpressions = loopCondition.split(">");
        } else if (loopCondition.contains("<")) {
            lcexpressions = loopCondition.split("<");
        } else if (loopCondition.contains(">=")) {
            lcexpressions = loopCondition.split(">=");
        } else if (loopCondition.contains("=<")) {
            lcexpressions = loopCondition.split("<=");
        } else if (loopCondition.contains("!=")) {
            lcexpressions = loopCondition.split("!=");
        }
        
        if (lcexpressions != null) {
            String variableName = lcexpressions[0];
            return variableName;
        }
        return "";
    }
    
    
    /*
    private boolean isValid(String loopCondition) {
        
        return false;
    }*/

    /**
     * Helper method determines which input statement to insert inside a code
     * @param loopConditionType: 
     * @return string
     */
    private String getInputStatement(String loopConditionType) {
        if (loopConditionType.equals("String")) {
            return "in.next();";
        }  else if (loopConditionType.equals("int") || loopConditionType.equals("Integer")) {
            return "in.nextInt();";
        } else if (loopConditionType.equals("boolean") || loopConditionType.equals("Boolean")) {
            return "in.nextBoolean();";
        } else if (loopConditionType.equals("long") || loopConditionType.equals("Long")) {
            return "in.nextLong();";
        } else if (loopConditionType.equals("double") || loopConditionType.equals("Double")) {
            return "in.nextDouble()";
        } else if (loopConditionType.equals("float") || loopConditionType.equals("Float")) {
            return "in.nextFloat()";
        } else if (loopConditionType.equals("short") || loopConditionType.equals("Short")) {
            return "in.nextShort()";
        } else if (loopConditionType.equals("byte")) {
            return "in.nextByte()";
        } else if (loopConditionType.equals("BigInteger")) {
            return "in.nextBigIneger()";
        } else if (loopConditionType.equals("BigDecimal")) {
            return "in.nextBigDecimal()";
        } else {
            return ";";
        }
    }
}
