package aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;



    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void output(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("test.txt");

        try{
//            System.out.println("Resource加载文件内容为：" + resource.toString());
            System.out.println("Resource加载文件内容为：" + IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
